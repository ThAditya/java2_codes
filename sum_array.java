
// Program to find the sum of all elements in an array.
import java.util.*;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int sum = 0;
        int nums[] = new int[n];
        System.out.println("Enter the value of array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}