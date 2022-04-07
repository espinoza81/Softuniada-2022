import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int[] array = Arrays
                .stream(console.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i=0; i<n-1; i++){
            if(i%2==0) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            else {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[n-1]);
    }
}
