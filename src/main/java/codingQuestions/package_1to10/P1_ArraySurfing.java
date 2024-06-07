package codingQuestions.package_1to10;

//
import java.util.Arrays;

public class P1_ArraySurfing {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //forEach loop
        for (int element : array) {
            System.out.println(element);
        }
        //while loop
        int i=0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        //do-while loop

        int j = 0;

        do {
            System.out.println(array[j]);
            j++;
        } while (j < array.length);

        //stream api
        Arrays.stream(array).forEach(System.out::println);
    }
}
