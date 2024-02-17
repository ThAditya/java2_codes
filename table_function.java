
// Make a function to print the table of a given number n.
import java.util.*;

public class table_function {
    public static int printTable(int num) {
        int i, flag = 0;
        for (i = 0; i <= 10; i++) {
            System.out.println(num * i);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printTable(num);
    }
}