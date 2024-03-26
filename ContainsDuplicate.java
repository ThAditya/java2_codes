import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}