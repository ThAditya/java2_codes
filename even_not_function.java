
// Make a function to check if a given number n is even or not
import java.util.*;

public class even_not_function {
    public static int checkEven(int num) {
        int i;
        int flag = 0;
        for (i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("even");
        } else {
            System.out.println("not even");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEven(num);
    }
}
