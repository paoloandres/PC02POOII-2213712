import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio8 {
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = Arrays.asList(2, 5, 8, 10, 3, 7, 4, 6);

        
        List<Integer> resultado = calcularCuboYFiltrar(listaNumeros);

    
        System.out.println(resultado);
    }

    
    public static List<Integer> calcularCuboYFiltrar(List<Integer> lista) {
        return lista.stream()
                .map(numero -> numero * numero * numero) 
                .filter(cubo -> cubo > 50)  
                .collect(Collectors.toList());
    }
}
