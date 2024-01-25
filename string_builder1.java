
// by using String Builder Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;

public class string_builder1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();// size = 5
        int length = 0;
        String str[] = new String[size];
        System.out.println("Enter the value of array: ");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();// [hey hel hell hello helw]
            StringBuilder str1 = new StringBuilder(str[i]);
            length += str1.length();//
        }
        System.out.println("the combined length of the String: ");
        System.out.println(length + " ");

    }
}
