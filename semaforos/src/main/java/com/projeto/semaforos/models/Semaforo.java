package com.projeto.semaforos.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "semaforo")
public class Semaforo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer porta;

    private Boolean ligado;

    private LocalDateTime dataHora;

    public Semaforo() {
    }

    public Semaforo(Integer porta, Boolean ligado) {
        this.porta = porta;
        this.ligado = ligado;
        this.dataHora = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
