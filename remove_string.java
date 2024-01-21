// Input an email from the user.You have to create a username from the email by deleting the part that comes
// after‘@’.Display that username to the user.
// Example:email=“apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
// email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.Scanner;

public class remove_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        String username = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                username += str.charAt(i);
            }
        }
        System.out.println("the changing username is: ");
        System.out.println(username);
    }
}