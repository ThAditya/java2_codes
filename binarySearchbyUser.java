
// Binary search by using loop by taking input from User
import java.util.*;

public class binarySearchbyUser {
    public static void binarySearch(int[] arr, int key, int mid) {
        int LB = 0;
        int UB = arr.length - 1;
        int flag = 0;
        while (LB <= UB) {
            mid = (LB + UB) / 2;
            if (arr[mid] == key) {
                flag = 1;
                break;
            }
            if (arr[mid] > key) {
                UB = mid - 1;
            } else {
                LB = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element " + arr[mid] + " is found at index " + mid);
        } else {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the value of array: ");
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value which is going to be found: ");
        int key = sc.nextInt();
        int mid = 0;
        binarySearch(arr, key, mid);
    }
}
