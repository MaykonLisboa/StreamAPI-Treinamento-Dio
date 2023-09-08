package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificarNumDistinto {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numDistinto = numeros.stream()
        .allMatch(numero -> numeros.stream().filter(n -> n.equals(numero)).count()==1);
        
        List<Integer> numerosRepetidos = numeros.stream()
            .filter(numero -> numeros.stream().filter(n -> n.equals(numero)).count() > 1)
            .distinct()
            .collect(Collectors.toList());

        if (numDistinto){
            System.out.println("Todos os numero são distintos.");
        } else {
            System.out.println("Numeros repetidos."+numerosRepetidos);
        }


        
    }
    
}
