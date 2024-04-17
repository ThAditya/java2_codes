import java.util.*;

public class Merge_and_SortArray { 

    public static void printMergedArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

       
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[arr1.length + arr2.length]; 


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println();
        System.out.println("Array after sorting and merging:");
        for (int element : mergedArray) { 
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array (size1):");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements of first array (arr1):");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array (size2):");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array (arr2):");

        for (int j = 0; j < size2; j++) {
            arr2[j] = sc.nextInt();
        }

        printMergedArray(arr1, arr2);
    }
}
