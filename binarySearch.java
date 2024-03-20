import java.util.*;

//searching String using binary search
public class binarySearch {
    public static void SearchName(String[] str, int mid, String name) {
        int LB = 0;
        int UB = str.length - 1;
        int flag = 0;
        while (LB <= UB) {
            mid = (LB + UB) / 2;
            if (str[mid].equals(name)) {
                flag = 1;
                break;
            }
            if (str[mid].compareTo(name) > 0) {
                UB = mid - 1;
            } else {
                LB = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Name " + str[mid] + " at index " + mid);
        } else {
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        String str[] = new String[size];
        System.out.println("Enter the name: ");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }
        System.out.println("write the Stringname to search: ");
        String name = sc.next();
        int mid = 0;
        SearchName(str, mid, name);
    }
}