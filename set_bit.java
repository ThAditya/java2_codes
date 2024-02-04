import java.util.*;

public class set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int newnumber = bitMask | num;
        System.out.println("output is: " + newnumber);
    }
}