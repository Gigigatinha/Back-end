package com.biolab.ecommerce.services;

import com.biolab.ecommerce.DTO.ProdutoDTO;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.entities.Produto;
import com.biolab.ecommerce.repositories.CategoriaRepository;
import com.biolab.ecommerce.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public ProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }
    public String criar(ProdutoDTO dto) {
        Produto p = new Produto();
        p.setNome(dto.getNome());
        p.setDescricao(dto.getDescricao());
        p.setPreco(dto.getPreco());
        p.setImgUrl(dto.getImgUrl());
        Categoria cat = categoriaRepository.getReferenceById(dto.getIdCategoria());
        p.getCategorias().add(cat);

        produtoRepository.save(p);
        return "Produto salvo com sucesso";
    }

    public List<Produto> mostrarProduto() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }//xxx

    public Produto buscarPorId(long id) {
        Produto p = produtoRepository.findById(id).orElseThrow();
        return p;
    }
    public String alterar(long id, ProdutoDTO dto) {
        Produto p = produtoRepository.findById(id).orElseThrow();

        p.setNome(dto.getNome());
        p.setDescricao(dto.getDescricao());
        p.setPreco(dto.getPreco());
        p.setImgUrl(dto.getImgUrl());
        produtoRepository.save(p);

        return "Produto atualizado com sucesso";
    }

    public String deletar(long id) {
        Produto p = produtoRepository.findById(id).orElseThrow();
        produtoRepository.delete(p);

        return "Produto excluido com sucesso";
    }
}
