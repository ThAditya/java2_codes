import java.util.*;

public class insertion_array {
    public static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int insertion(int arr[], int size, int capacity, int element, int index) {
        if (size >= capacity) {
            return -1;
        }
        for (int i = index - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        int size = 4, element = 45, index = 3;
        display(arr, size);
        insertion(null, size, size, element, index);
        size += 1;
        display(arr, size);
    }
}
