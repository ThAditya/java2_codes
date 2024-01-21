//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class Strings_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length pf the array:");
        int size = sc.nextInt();
        int str1 = 0;
        String str[] = new String[size];
        System.out.println("values of the array:");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
            str1 += str[i].length();
        }
        System.out.println("the combined length of the String: ");
        System.out.print(str1 + " ");
    }
}