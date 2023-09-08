package Desafios;

import java.util.Arrays;
import java.util.List;

public class VeiricarSeHaNumeroMaior10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroMaiorQue10 = numeros.stream().anyMatch(numero -> numero > 10);

        String mensagem = numeroMaiorQue10 ? "Há números maiores que 10":"Não há números maiores do que 10";

        System.out.println(mensagem);

        

    }
    
}
