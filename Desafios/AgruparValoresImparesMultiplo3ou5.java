package Desafios;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparValoresImparesMultiplo3ou5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
   
        Map<Integer, List<Integer>> grupos = numeros.stream()
        .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
        .collect(Collectors.groupingBy(
            numero -> numero % 3 == 0 ? 3:5,
            Collectors.toList()
        ));
        System.out.println("Numeros impares múltiplos de 3 e de 5 agrupados");
        grupos.forEach((key, value) -> System.out.println("Chave: "+key+", Valor: "+ value));;
    }

    

}
