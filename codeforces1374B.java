// codeforces problem no. 1347B

import java.util.*;

public class codeforces1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 0, b = 0;
            while (n % 2 == 0) {
                n /= 2;
                a++;
            }
            while (n % 3 == 0) {
                n /= 3;
                b++;
            }
            if (n > 1 || a > b) {
                System.out.println(-1);
            } else {
                System.out.println(2 * b - a);
            }
        }
    }
}
