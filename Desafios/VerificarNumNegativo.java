package Desafios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumNegativo {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numNegativo = numeros.stream()
        .anyMatch(numero -> numero < 0);

        if (numNegativo){
            System.out.println("Contém numeros pelo menos 1 numero negativo na lista");
        }else{
            System.out.println("Não contem numeros negativos na lista.");
        }


        

    }
    
}
