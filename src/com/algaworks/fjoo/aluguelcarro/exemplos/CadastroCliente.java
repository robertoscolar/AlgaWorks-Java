package com.algaworks.fjoo.aluguelcarro.exemplos;

import com.algaworks.fjoo.aluguelcarro.model.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto", LocalDate.of(1980, Month.AUGUST,13));
        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idade >= 18) {
            System.out.printf("Você pode se cadastrar pois tem %d anos", idade);
        }else {
            System.err.printf("Você não pode se cadastrar com a idade de %d" ,idade);
        }
    }
}
