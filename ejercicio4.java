import java.util.Arrays;
import java.util.List;

public class ejercicio4 {
    public static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ,12 ,13 ,14 ,15);

    
        long totalElementos = contarElementos(listaNumeros);

       
        System.out.println("Número total de elementos en la lista: " + totalElementos);
    }

    
    public static long contarElementos(List<Integer> lista) {
        return lista.stream().count();
    }
}
