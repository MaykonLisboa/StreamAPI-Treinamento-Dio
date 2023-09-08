package Desafios;
import java.util.Arrays;
import java.util.List;

public class VerificarSeTodosOsNumerosSaoIguais {

    public static void main(String[] args) {
        
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
         boolean todosIguais = numeros.stream()
         .distinct()
         .count() == 1;

         if (todosIguais){
            System.out.println("Todos os numeros são iguais.");
         } else {
            System.out.println("Os numeros são diferentes.");
         }
    }
    
}
