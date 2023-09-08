package Desafios;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPrimos {
    

    public static void main(String[] args) {
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         List<Integer> numPrimos = numeros.stream()
         .filter(NumerosPrimos::isPrimo)
         .collect(Collectors.toList());

         System.out.println("Numeros Primos na lista: "+numPrimos);
    }
    public static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        } 
        for (int i = 2; i * i <= numero; i++ ){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

}
