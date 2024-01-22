import java.util.*;

public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("The result is : ");
        System.out.println(sb);
    }
}