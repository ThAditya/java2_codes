import java.util.*;

class primeclass {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Ennter the number = ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}