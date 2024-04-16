import java.util.*;

public class Merge_and_SortArray {
    public static void printMergedArray(int[] arr1, int[] arr2) {
        // System.out.println("Array before sorting and merging : ");
        // for (int j = 0; j < arr1.length - 1; j++) {
        // System.out.print(arr1[j] + " " + arr2[j] + " ");
        // }
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array after sorting and merging : ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + " " + arr2[j] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size1");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("arr1");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("size2");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("arr2");

        for (int j = 0; j < size2; j++) {
            arr2[j] = sc.nextInt();
        }

        printMergedArray(arr1, arr2);
    }
}