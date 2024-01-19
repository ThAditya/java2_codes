package array;

import java.util.*;

public class searching_array_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int size = sc.nextInt();
        String str[] = new String[size];
        System.out.println("Enter the String: ");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        System.out.println("Enter the String for search: ");
        String x = sc.next();
        int flag = 0, index = 0;
        for (int j = 0; j < size; j++) {
            if (x.equals(str[j])) {
                flag = 1;
                index = j;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("String found at index" + index);
        } else {
            System.out.println("Invalid String");
        }

    }
}