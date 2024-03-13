
//Bubble sort by taking the input from the user
import java.util.*;

public class bubblesort {
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        System.out.println("Array list before sorting: ");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println();
        System.out.println("Array list after sorting: ");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        bubbleSort(arr);
    }
}
