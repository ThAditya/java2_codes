
// Program to calculate the average of elements in an array.
import java.util.*;

public class avg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length pf the array:");
        int n = sc.nextInt();
        int sum = 0;
        int avg = 0;
        System.out.println("values of the array:");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            avg = (sum / nums.length);
        }
        System.out.println("sum of the array:");
        System.out.println(sum);
        System.out.println("Average of the array:");
        System.out.println(avg);

    }
}
