import java.util.Scanner;

public class String_in_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the VALUE:");
        int n = sc.nextInt();
        System.out.println("enter the names:");
        String names[] = new String[n];
        // inner
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();

        }
        // outer
        for (int i = 0; i < names.length; i++) {
            System.out.println("names" + (i + 1) + "is:" + names[i]);
        }

    }
}
