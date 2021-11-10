package com.algaworks.fjoo.aluguelcarro.exemplos;

import com.algaworks.fjoo.aluguelcarro.model.Aluguel;
import com.algaworks.fjoo.aluguelcarro.model.Carro;
import com.algaworks.fjoo.aluguelcarro.model.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Roberto", LocalDate.of(1980, Month.AUGUST, 13));
        Carro gol = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataEHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, gol, dataEHoraDaRetirada, dataEHoraPrevistaDevolucao);

        imprimirRecibo(aluguel);
    }


    private static void imprimirRecibo(Aluguel aluguel) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>RECIBO<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Retirada: " + aluguel.getDataEHoraRetirada().format(formatter));
        System.out.println("Devolução prevista para: " + aluguel.getDataEHoraPrevistaDevolucao().format(formatter));
    }
}
