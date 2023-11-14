import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) {
      
        List<Integer> listaNumeros = Arrays.asList(5, 2, 8, 1, 7, 3, 6, 4, 10, 9);

        
        imprimirEnOrdenDescendente(listaNumeros);
    }

    public static void imprimirEnOrdenDescendente(List<Integer> lista) {
        List<Integer> resultado = lista.stream()
                .sorted((a, b) -> b.compareTo(a))  
                .collect(Collectors.toList());

        
        System.out.println("Valores en orden descendente:");
        resultado.forEach(System.out::println);
    }
}
