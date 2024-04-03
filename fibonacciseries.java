import java.util.*;

public class fibonacciseries {
    public static void printSeries(int num) {
        int f1 = 0;
        int f2 = 1;
        int sum;
        System.out.print(f1 + " " + f2);
        for (int i = 0; i < num; i++) {
            sum = f1 + f2;
            System.out.print(" " + sum);
            f1 = f2;
            f2 = sum;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printSeries(num);
    }
}
