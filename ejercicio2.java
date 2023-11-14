import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(51, 23, 45, 567, 512, 89, 500, 454, 555, 678, 345, 598);

        List<Integer> numerosComienzanCon5 = numeros.stream()
                                                   .filter(num -> num.toString().startsWith("5"))
                                                   .collect(Collectors.toList());

        System.out.println("Números que comienzan con 5: " + numerosComienzanCon5);
    }
}