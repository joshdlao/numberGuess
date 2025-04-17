package numberGuess;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    Scanner sc = new Scanner (System.in);
    Random random = new Random();
    public static void main(String [] args) {
        NumberGuess ng = new NumberGuess();
        ng.mainMenu();
    }

    public void mainMenu() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Great! You have selected the Easy difficulty level.");
            startGame(10);
            break;

            case 2:
            System.out.println("Great! You have selected the Medium difficulty level.");
            startGame(5);
            break;

            case 3:
            System.out.println("Great! You have selected the Hard difficulty level.");
            startGame(3);
            break;

            default:
            System.out.println("Wrong input");
            mainMenu();
            break;
        }
    }

    public void startGame(int counter) {

        System.out.println("Let's start the game!");

        int answer = random.nextInt(101);
        for(int i = 1; i <= counter;) {
            System.out.print("Guess: ");
            int guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("Congratulations! You guessed the correct number in " + i + " attempts.");
                restartGame();
                break;

            } else {
                if (answer < guess) {
                    System.out.println("Incorrect! The number is less than " + guess);
                } else {
                    System.out.println("Incorrect! The number is greater than " + guess);
                }

                i++;
            }
        }
    }

    public void restartGame() {
        System.out.println("Would you like to restart the game?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            mainMenu();
            break;

            case 2:
            System.out.println("Thanks for Playing!");
            break;
        }
    }

}