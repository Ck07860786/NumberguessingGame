import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfGuesses = 0;
        int maxGuesses = 5;


        System.out.println("Welcome to the universe of  Number Guessing Game!");
        System.out.println("I've picked a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        System.out.println("You have " + maxGuesses + " guesses. Try to guess it!");

        System.out.println("Best Of Luck!");
        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < numberToGuess) {
                System.out.println("Try higher!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try lower!");
            } else {
                int score = calculateScore(maxGuesses, numberOfGuesses);
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfGuesses + " guesses.");
                System.out.println("Your score: " + score);
                break;


            }
            int guessesLeft = maxGuesses - numberOfGuesses;
            if (guessesLeft > 0) {
                System.out.println("You have " + guessesLeft + " guesses left.");
            } else {
                System.out.println("Sorry, you've run out of guesses. The number was: " + numberToGuess);
                System.out.println("Play Again!");
                break;
            }
        }


    }

    public static int calculateScore(int maxGuesses, int numberOfGuesses) {
        return (int) Math.round(100.0 * (maxGuesses - numberOfGuesses + 1) / maxGuesses);
    }
}



