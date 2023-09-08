package Desafios;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParesEImpares {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .collect(Collectors.toList());

        
        List<Integer> impares = numeros.stream()
        .filter(numero -> numero % 2 != 0)
        .collect(Collectors.toList());

        System.out.println("Resultado da lista de pares: "+pares);
        System.out.println("Resultado da lista de impares: "+impares);

    }
    
}
