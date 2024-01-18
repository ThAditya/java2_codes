package array;

// . Program to search for a specific element in an array.
import java.util.*;

public class searching_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the value of array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value for search: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                System.out.println("x is fond at index: " + x);
            }
        }
    }
}