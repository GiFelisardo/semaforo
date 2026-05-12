package com.projeto.semaforos.services;

import com.projeto.semaforos.models.Semaforo;
import com.projeto.semaforos.repositories.SemaforoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.projeto.semaforos.models.Semaforo;
import com.projeto.semaforos.repositories.SemaforoRepository;

@Service
public class SemaforoService {

    @Autowired
    private SemaforoRepository repository;

    public void executarLoop() throws InterruptedException {

        // PRIMEIRO ESTADO
        salvarEstado(9, false);
        salvarEstado(10, true);
        salvarEstado(11, true);
        salvarEstado(12, false);
        salvarEstado(13, false);

        Thread.sleep(3000);

        // SEGUNDO ESTADO
        salvarEstado(11, false);
        salvarEstado(12, true);
        salvarEstado(13, false);

        Thread.sleep(2000);

        // TERCEIRO ESTADO
        salvarEstado(9, true);
        salvarEstado(10, false);
        salvarEstado(11, false);
        salvarEstado(12, false);
        salvarEstado(13, true);

        Thread.sleep(5000);
    }

    private void salvarEstado(Integer porta, Boolean ligado) {

        Semaforo led = new Semaforo(porta, ligado);

        repository.save(led);
    }

    public List<Semaforo> listarTodos() {
        return repository.findAll();
    }
}
