package com.algaworks.fjoo.aluguelcarro.model;

import java.time.Year;

public class Carro {

    private String modelo;
    private double diaria;
    private Year anoFabricacao;

    public Carro(String modelo, double diaria, Year anoFabricacao) {
        this.modelo = modelo;
        this.diaria = diaria;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public Year getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Year anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
