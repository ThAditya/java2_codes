import java.util.*;

public class clean_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();
        System.out.println("Enter the bitmask: ");
        int bitMask = sc.nextInt();
        bitMask = bitMask << pos;
        int newnum = (~bitMask) & n;
        System.out.println("Output after clean bit: " + newnum);
    }
}
