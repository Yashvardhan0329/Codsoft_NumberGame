package Codesoft;
import java.util.*;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int wins = 0;
        boolean playAgain = true;
        
        System.out.println("Hi! Welcome to the Number Game :-)");
        System.out.println("Player! You have " + chances + " chances to win the game. Let's see how you play.");

        while (playAgain) {
            int rand = getRandN(1, 100);
            boolean guessedCorrectly = false;

            for (int i = 0; i < chances; i++) {
                System.out.println("Chance " + (i + 1) + ": Enter your guess:");
                int userGuess = sc.nextInt();

                if (userGuess == rand) {
                    guessedCorrectly = true;
                    wins++;
                    System.out.println("You won it!");
                    break;
                } else if (userGuess > rand) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you lost all your chances. The number was " + rand + ".");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Hope you enjoyed the game :-)");
        System.out.println("Your score is: " + wins);
        sc.close();
    }

    public static int getRandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
