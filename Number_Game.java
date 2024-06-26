package java2_codes;
import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int random_generatednumber = ran.nextInt(100);
            System.out.println("Let's begin our game to guess a number 0-100");
            int count = 0;
            while (true) {
                int guess = sc.nextInt();
                if (guess != random_generatednumber) {
                    count++;
                    System.out.println("Wrong guessed..." + (20 - count) + " attempts left");
                    if (guess > random_generatednumber) {
                        System.out.println("Too High");
                    }
                    if (guess < random_generatednumber) {
                        System.out.println("Too Low");
                    }
                    if (count == 20) {
                        String check = sc.next();
                        if (check.equalsIgnoreCase("yes")) {
                            break;
                        } else {
                            break;
                        }
                    }
                    continue;
                } else {
                    System.out.println("Right guessed");
                    break;
                    }
                }
                System.out.println("Do you want to play again : yes/no");
                String check = sc.next();
                if (check.equalsIgnoreCase("yes")) {
                    continue;
                }else{
                    break;
            }
        }
    }
}