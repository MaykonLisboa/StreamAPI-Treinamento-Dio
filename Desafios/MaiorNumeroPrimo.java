package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

          Optional<Integer> maiorPrimo = numeros.stream()
          .filter(numero ->{
            if (numero <= 1) return false;
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) return false;
            } 
            return true;
          })
          .max(Integer::compare);
          
          if (maiorPrimo.isPresent()){
            System.out.println("O maior numero primo da lista é : "+maiorPrimo);
          } else {
            System.out.println("Não há numeros primos na lista");
          }

    }
}    
    

