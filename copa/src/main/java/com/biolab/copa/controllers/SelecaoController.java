package com.biolab.copa.controllers;

import com.biolab.copa.entities.Selecao;
import com.biolab.copa.repositories.SelecaoRepositoriy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelecaoController {

    private final SelecaoRepositoriy selecaoRepositoriy;

    public SelecaoController(SelecaoRepositoriy selecaoRepositoriy) {
        this.selecaoRepositoriy = selecaoRepositoriy;
    }

    @PostMapping
    public String criarSelecao(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(), selecao.getUniforme(), selecao.getMascote());
        selecaoRepositoriy.save(s);
        return "Salvo com sucesso!" ;
    }

    @PostMapping(value = "/teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(), selecao.getUniforme(), selecao.getMascote());
        selecaoRepositoriy.save(s);
        return s ;
    }

    @GetMapping
    public List<Selecao> mostrarselecao(){
        List<Selecao> listarSelecao = selecaoRepositoriy.findAll();
        return listarSelecao;
    }
}
