import java.util.*;

public class ParityCheck {
    public static void CheckCount(String str) {
        int countOne = 0;
        int countZero = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                countOne++;
                countZero = 0;
                if (countOne == 7) {
                    System.out.println("Yes");
                    return;
                }
            } else {
                countZero++;
                countOne = 0;
                if (countZero == 7) {
                    System.out.println("yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        CheckCount(str);
    }
}
