import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        // System.out.print("Enter your choice: ");
        // int choice = sc.nextInt();

        int x = random.nextInt(101);
        
        System.out.println(x);
    
    }
}