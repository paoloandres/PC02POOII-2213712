import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ejercicio6 {
    public static void main(String[] args) {
        
        int[] arrayNumeros = {1, 2, 3, 4, 1, 2, 3, 1, 2, 5};

    
        boolean resultado = tieneAlMenosTresRepetidos(arrayNumeros);

      
        System.out.println(resultado);
    }

    
    public static boolean tieneAlMenosTresRepetidos(int[] array) {
      
        Map<Integer, Integer> conteoMap = new HashMap<>();

        Arrays.stream(array)
                .forEach(elemento -> conteoMap.put(elemento, conteoMap.getOrDefault(elemento, 0) + 1));

        
        return conteoMap.values().stream().anyMatch(ocurrencias -> ocurrencias >= 3);
    }
}
