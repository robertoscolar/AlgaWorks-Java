package com.algaworks.fjoo.aluguelcarro.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

    private Cliente cliente;
    private Carro carro;
    private LocalDateTime dataEHoraRetirada;
    private LocalDateTime dataEHoraPrevistaDevolucao;
    private LocalDateTime dataEHoraRealDaDevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraRetirada, LocalDateTime dataEHoraPrevistaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataEHoraRetirada = dataEHoraRetirada;
        this.dataEHoraPrevistaDevolucao = dataEHoraPrevistaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDateTime getDataEHoraRetirada() {
        return dataEHoraRetirada;
    }

    public void setDataEHoraRetirada(LocalDateTime dataEHoraRetirada) {
        this.dataEHoraRetirada = dataEHoraRetirada;
    }

    public LocalDateTime getDataEHoraPrevistaDevolucao() {
        return dataEHoraPrevistaDevolucao;
    }

    public void setDataEHoraPrevistaDevolucao(LocalDateTime dataEHoraPrevistaDevolucao) {
        this.dataEHoraPrevistaDevolucao = dataEHoraPrevistaDevolucao;
    }

    public LocalDateTime getDataEHoraRealDaDevolucao() {
        return dataEHoraRealDaDevolucao;
    }

    public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
        this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
    }

    public void imprimeFatura() {
        Duration duration = Duration.between(dataEHoraPrevistaDevolucao, dataEHoraRealDaDevolucao);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>Fatura<<<<<<<<<<<<<<<<<<<<<<<");
        if (!duration.isNegative()) {
            double multa = duration.toHours() * carro.getDiaria() * 0.1;
            System.out.println("Valor da multa: R$ " + multa + " pois você atrasou " + duration.toHours() + " horas.");
        }else {
            System.out.println("Obrigado! Você foi pontual!");
        }
    }
}
