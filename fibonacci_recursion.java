
// print fibonacci series of number n
import java.util.*;

public class fibonacci_recursion {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        printFibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the integer of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the integer of n: ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        printFibonacci(a, b, n - 2);
    }
}