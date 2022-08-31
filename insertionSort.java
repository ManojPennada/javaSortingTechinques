import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i, j, current;
            for (i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 1; i < arr.length; i++) {
                current = arr[i];
                j = i - 1;
                while (j >= 0 && current < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = current;
            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}