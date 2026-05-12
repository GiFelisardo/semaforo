package com.projeto.semaforos.controllers;

import com.projeto.semaforos.models.Semaforo;
import com.projeto.semaforos.services.SemaforoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semaforo")
public class SemaforoController {

    @Autowired
    private SemaforoService service;

    @PostMapping("/executar")
    public String executar() throws InterruptedException {
        service.executarLoop();
        return "Loop executado com sucesso!";
    }

    @GetMapping("/dados")
    public List<Semaforo> listarDados() {
        return service.listarTodos();
    }
}