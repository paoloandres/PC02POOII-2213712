import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 7, 2, 9, 3, 5, 7, 8, 2, 1);

        List<Integer> numerosDuplicados = numeros.stream()
                                                .collect(Collectors.groupingBy(i -> i))
                                                .entrySet()
                                                .stream()
                                                .filter(entry -> entry.getValue().size() > 1)
                                                .map(entry -> entry.getKey())
                                                .collect(Collectors.toList());

        System.out.println("Números duplicados: " + numerosDuplicados);
    }
}
