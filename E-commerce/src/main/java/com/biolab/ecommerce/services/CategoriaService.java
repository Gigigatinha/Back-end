package com.biolab.ecommerce.services;

import com.biolab.ecommerce.DTO.CategoriaDTO;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public String criarCategoria(CategoriaDTO dto) {
        Categoria categoria = new Categoria();
        categoria.setNome(dto.getNome());
        categoriaRepository.save(categoria);
        return "Categoria criada com sucesso!";
    }

    public List<CategoriaDTO> mostrarCategoria() {
        return categoriaRepository.findAll().stream()
                .map(categoria -> new CategoriaDTO(categoria.getId(), categoria.getNome()))
                .toList();
    }//xxx

    public CategoriaDTO buscarCatId(long id){
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        CategoriaDTO dto = new CategoriaDTO();
        dto.setId(categoria.getId());
        dto.setNome(categoria.getNome());
        return dto;
    }

    public String alterar(long id, CategoriaDTO dto) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        categoria.setNome(dto.getNome());
        categoriaRepository.save(categoria);
        return "Categoria alterada com sucesso!"; //xxxxxx//
    }

    public String delete(long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        categoriaRepository.deleteById(id);
        return "Excluido com sucesso!";
    }

}