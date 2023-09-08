package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumerosDentroDeIntervalo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosFiltrados = numeros.stream()
        .filter(numero -> numero >= 5 && numero <= 10)
        .collect(Collectors.toList());

        System.out.println("O numeros filtrados no intervalo entre 5 e 10 é: "+numerosFiltrados);
    }

    
}
