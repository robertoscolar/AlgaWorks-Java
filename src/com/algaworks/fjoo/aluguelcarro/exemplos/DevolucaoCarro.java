package com.algaworks.fjoo.aluguelcarro.exemplos;

import com.algaworks.fjoo.aluguelcarro.model.Aluguel;
import com.algaworks.fjoo.aluguelcarro.model.Carro;
import com.algaworks.fjoo.aluguelcarro.model.Cliente;

import java.time.*;

public class DevolucaoCarro {
    public static void main(String[] args) {
        Aluguel aluguel = recuperarAluguel();

        //Para cada hora de atraso, ele paga 10% do carro em multa
        //46 * 9 = 414
        LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
        aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
        aluguel.imprimeFatura();
    }

    private static Aluguel recuperarAluguel () {

        Cliente cliente = new Cliente("Roberto", LocalDate.of(1980, Month.AUGUST, 13));
        Carro gol = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataEHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, gol, dataEHoraDaRetirada, dataEHoraPrevistaDevolucao);

        return aluguel;
    }
}
