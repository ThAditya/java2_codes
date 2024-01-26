
// Make a function to check if a number is prime or not.
import java.util.*;

public class prime_by_function {

    public static int checkPrime(int num) {
        int flag = 0;
        if (num == 0 || num == 1) {
            flag = 1;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime num");
        } else {
            System.out.println("not a Prime num");
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);
    }
}