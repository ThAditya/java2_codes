
// codeforces problem no. 1475B
import java.util.*;

public class codeforces1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // System.out.println("Enter the value of N: ");
            int n = sc.nextInt();
            if ((n / 2020) >= (n % 2020)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
