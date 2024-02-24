
// searching of array element by using function
import java.util.*;

public class searching_function {
    public static int searchingArrayFunction(int size, int num[], int x) {
        int i;

        for (i = 0; i <= size; i++) {
            if (num[i] == x) {
                return 1;
            } else {
                continue;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the value for searching: ");
        int x = sc.nextInt();

        int j = searchingArrayFunction(size, num, x);
        if (j == 1) {
            System.out.println("the item is found ");
        } else {
            System.out.println("the item is not found at index:");
        }
    }
}
