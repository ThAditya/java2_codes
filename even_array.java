package array;

import java.util.Scanner;

public class even_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Values of the Array: ");
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("Even numbers are: " + i + " ");
            }
        }
    }
}
