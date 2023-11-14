import java.util.Arrays;

public class ejercicio7 {
    public static void main(String[] args) {
       
        String[] arrayA = {"1", "2", "3", "4", "5", "8", "23"};
        String[] arrayB = {"4", "6", "8", "0", "2"};

        
        String[] arrayAB = concatenarArrays(arrayA, arrayB);

     
        System.out.println(Arrays.toString(arrayAB));
    }

    public static String[] concatenarArrays(String[] arrayA, String[] arrayB) {
        int lengthA = arrayA.length;
        int lengthB = arrayB.length;

      
        String[] arrayAB = new String[lengthA + lengthB];

        System.arraycopy(arrayA, 0, arrayAB, 0, lengthA);


        System.arraycopy(arrayB, 0, arrayAB, lengthA, lengthB);

        return arrayAB;
    }
}
