import java.util.Scanner;

//bubbleSort in Java;
public class bubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i, j, temp;
            for (i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < arr.length - 1; i++) {
                for (j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
