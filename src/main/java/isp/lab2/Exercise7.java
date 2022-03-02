package isp.lab2;

import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {

        int low = 0;
        int high = 7;

        return (int) (Math.random() * (high - low)) + low;

    }

    public static void main(String[] args) {
        //int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        int number = answers[times];
        int guess, numberGuess = 0, previousGuess;
        Scanner in = new Scanner(System.in);
        System.out.println("Guess the number: ");
        guess = in.nextInt();
        while (guess != number) {
            previousGuess = guess;
            if (guess < number) {
                System.out.println("The number is too small");
                System.out.println("Guess the number: ");
                guess = in.nextInt();
                if (previousGuess != guess)
                    numberGuess++;
            } else if (guess > number) {
                System.out.println("The number is to large");
                System.out.println("Guess the number: ");
                guess = in.nextInt();
                if (previousGuess != guess)
                    numberGuess++;
            }
        }

        System.out.println(numberGuess);
    }

}

