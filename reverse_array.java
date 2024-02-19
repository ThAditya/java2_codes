
// Program to reverse the elements of an array.
import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Values of the Array: ");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}