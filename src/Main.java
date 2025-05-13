import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Number Guessing Game

        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("\nWelcome to the NUMBER GUESSING GAME 🔢");
        System.out.printf("Guess a number between %d - %d (both inclusive) 🔍\n", min, max);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Too LOW, Guess higher 📈\n");
            } else if(guess > randomNumber){
                System.out.println("Too HIGH, Guess lower 📉\n");
            } else{
                System.out.println("Your guess is correct and the number is " + randomNumber);
                System.out.println("# of attempts = " + attempts);
            }
        } while (guess != randomNumber);

        scanner.close();

        System.out.println("\nThank you for playing the game ♨️");
    }
}
