
//  Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string
// with letter ‘i’. 
//  Example : 
//  original = “eabcdef’ ; result = “iabcdif”
//  Original = “xyz” ; result = “xyz”
import java.util.*;

public class string_builder_changing_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String result = "";
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'e') {
                result += "i";
            } else {
                result += sb.charAt(i);
            }
        }
        System.out.println("output is: ");
        System.out.println(result);
    }
}
