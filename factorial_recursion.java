
// factorial of number n
import java.util.*;

public class factorial_recursion {
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = printFactorial(n - 1);
        int fact = n * fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = sc.nextInt();

        int ans = printFactorial(n);
        System.out.println("Answer is: ");
        System.out.println(ans);
    }
}