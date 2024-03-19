import java.util.*;
public class insertionSort {
    public static void SortingbyInsertion(int[] arr) {

        System.out.println("Array before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }

        System.out.println();
        System.out.println("Array after Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        SortingbyInsertion(arr);
    }
}