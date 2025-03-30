import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int guess;
        Scanner sc = new Scanner(System.in);

        System.out.println("🎯 Guess a number between 1 and 100:");

        while (true) {
            guess = sc.nextInt();
            if (guess < secretNumber) {
                System.out.println("📉 Too low! Try again:");
            } else if (guess > secretNumber) {
                System.out.println("📈 Too high! Try again:");
            } else {
                System.out.println("🎉 Correct! The number was " + secretNumber);
                break;
            }
        }

        sc.close();
    }
}
