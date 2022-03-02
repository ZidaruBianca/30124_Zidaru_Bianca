package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        Random rand = new Random();
        int n = rand.nextInt(8) + 2;

        int[] array = new int[n];
        for (int i = 0; i< n; i++) {
            Scanner myInput = new Scanner(System.in);
            array[i] = myInput.nextInt();
        }
        return array;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double suma = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            suma = suma + userNumbers[i];
        }
        return suma/userNumbers.length;
    }

    public static void main(String[] args) {
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
