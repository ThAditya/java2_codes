package array;

import java.util.*;

public class searching_array_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the integer for search: ");
        int x = sc.nextInt();
        int flag = 0, index = 0;
        for (int i = 0; i < size; i++) {
            if (x == num[i]) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("num is found on index:" + index);
        } else {
            System.out.println("invalid number");
        }
    }
}

class searching_array_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int size = sc.nextInt();
        char letter[] = new char[size];
        System.out.println("Enter the characters: ");
        for (int i = 0; i < size; i++) {
            letter[i] = sc.next();
        }
        char x = sc.next();
    }
}

class searching_array_String {
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
        for (int i = 0; i < size; i++) {
            if (x == str[i]) {
                flag = 1;
                index = i;
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