package array;

//Program to sum of array
import java.util.*;

public class sum_even_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of the Array: ");
        int n = sc.nextInt();
        int sum = 0;
        int add = 0;
        System.out.println("Values of the Array: ");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum = sum + num[i];
            } else {
                add = add + num[i];
            }
        }
        System.out.print("addition of odd no.:");
        System.out.println(add + " ");
        System.out.println("sum of even no.:");
        System.out.print(sum + " ");
    }
}