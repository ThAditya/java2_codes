import java.util.Scanner;

public class max_value_in_descending_order {
    public static void printArrayDescendingOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println(" 3 Maximum values: ");
        int k = 3;
        for (int i = 0; i <= k - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the value of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printArrayDescendingOrder(arr);
    }
}