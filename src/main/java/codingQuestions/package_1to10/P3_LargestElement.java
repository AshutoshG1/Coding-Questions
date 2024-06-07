package codingQuestions.package_1to10;

public class P3_LargestElement {
    public static void main(String[] args) {
        int[] array = {12, 34, 5, 70, 46, 89, 2};

        int max = findLargestElement(array);
        System.out.println("The largest element in the array is: " + max);
    }

    public static int findLargestElement(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
