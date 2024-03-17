
// Binary search using recursion
import java.util.*;

public class binarySearchRecursion {
    public static int binarySearch(int[] arr, int key, int LB, int UB) {
        while (LB <= UB) {
            int mid = (LB + UB) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, UB, mid - 1, key);
            } else {
                return binarySearch(arr, LB, mid + 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binarySearchRecursion b = new binarySearchRecursion();
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88 };
        int key = 66;
        int value = b.binarySearch(arr, 0, arr.length - 1, key);
        if (value != -1) {
            System.out.println("Yes found");
        } else {
            System.out.println("Not found");
        }
    }
}