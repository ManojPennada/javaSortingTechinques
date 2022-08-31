import java.util.Scanner;

//selectionSort
public class selectionSort {
    public static void main(String[] args) {
        int n, i, j, temp;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            int[] arr = new int[n];
            for (i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < arr.length - 1; i++) {
                int smallest = i;
                for (j = i + 1; j < arr.length; j++) {
                    if (arr[smallest] > arr[j]) {
                        smallest = j;
                    }
                }
                temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
