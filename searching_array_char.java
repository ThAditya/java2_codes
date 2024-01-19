package array;

import java.util.*;

public class searching_array_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int size = sc.nextInt();
        char letter[] = new char[size];
        System.out.println("Enter the characters: ");
        for (int i = 0; i < size; i++) {
            letter[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the integer for search: ");
        char x = sc.next().charAt(0);
        int flag = 0, index = 0;
        for (int i = 0; i < size; i++) {
            if (x == letter[i]) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("char is found on index:" + index);
        } else {
            System.out.println("invalid character");
        }
    }
}