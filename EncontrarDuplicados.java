import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EncontrarDuplicados {
    public static void main(String[] args) {
       
        String[] arrayCadenas = {"a", "b", "c", "a", "b", "c", "d", "e"};

      
        Map<String, Long> duplicados = encontrarDuplicados(arrayCadenas);

        
        duplicados.forEach((elemento, frecuencia) -> {
            System.out.println("Elemento: " + elemento + ", Frecuencia: " + frecuencia);
        });
    }

    
    public static Map<String, Long> encontrarDuplicados(String[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}

//EJERCICIO 10
