
// Scan the all array and find the index value and if it is not found that print
// "-1"
import java.util.*;

public class linear_search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Values of the Array: ");
        int num[] = new int[n];
        int flag = 0;
        for (i = 0; i < n; i++) {
            num[i] = sc.nextInt();// for array values
        }
        System.out.println("enter the target value:");
        int target = sc.nextInt();
        for (i = 0; i < num.length; i++) {
            if (target == num[i]) {
                flag = 1;
                System.out.println(i);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("-1");
        }
    }
}