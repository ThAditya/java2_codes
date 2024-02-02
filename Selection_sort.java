import java.util.*;

public class Selection_sort {
    public static void printSelection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the value of array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printSelection(arr);
    }

}
