
// Program to print contiguous sub array with the largest sum in given set of
// integers
import java.util.*;

public class Solution {

    public static int printsub(int numbers[]) {
        int st = 0;
        int en = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                }
                if (maxsum < sum) {
                    maxsum = sum;
                    st = i;
                    en = j;
                }
            }
        }
        System.out.println(maxsum);
        for (int i = st; i <= en; i++) {
            System.out.print(numbers[i] + " ");
        }
        return 0;
    }
}