
// Program to delete an element from a specific position in an array.
import java.util.*;

public class deletion1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the values of array:");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        System.out.println("Enter the position:");
        int position = sc.nextInt();
        for (int i = position; i < m - 1; i++) {
            arr[i] = arr[i + 1];
        }
        m--;
        System.out.println("value after deletion ");
        for (int i = 0; i < m; i++)
            System.out.print((arr[i] + " "));
    }
}