package homework01;

import java.util.Scanner;

public class NumbersApp {
    public static void main(String[] args) {
        final int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please , enter your name: ");
        final String name = scanner.nextLine();

        System.out.printf("Let the game begin, %s!\n", name);
        int  guessedNum;
        while (true){
            System.out.println("Your guess: ");
            guessedNum = scanner.nextInt();

            if (guessedNum < randomNum){
                System.out.println("Your number is too small. Please, try again.");
            }else if (guessedNum > randomNum){
                System.out.println("your number is too big. Please, try again.");
            }else {
                System.out.printf("Congratulations, %s!", name);
                break;
            }
        }
    }
}
