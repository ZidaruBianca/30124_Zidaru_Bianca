package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        // Check if number is less than equal to 1
        if (number <= 1)
            return false;
            // Check if number is 2
        else if (number == 2)
            return true;
            // Check if n is a multiple of 2
        else if (number % 2 == 0)
            return false;
        // If not, then just check the odds
        for (int i = 3; i <= number/2; i += 2)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {

        int suma = 0 ;

        while (number != 0) {
            suma = suma + number%10;
            number = number/10;
        }
        return suma;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)

        int contor = 0;
        int j = 0;

        for (int i = a; i <= b; i++)
            if (isPrimeNumber(i))
                contor ++;
            int [] prime = new int [contor];

        for (int i = a; i <= b; i++)
            if(isPrimeNumber(i)) {
                prime[j] = i;
                j++;
            }
        return prime;
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        double geo = 1;
        double length = primeNumbers.length;

        for (int i = 0; i < primeNumbers.length; i++)
            geo = geo * primeNumbers[i];

        return Math.pow(geo, 1/length);
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int k = 0;

        for (int i = 0; i<primeNumbers.length; i++)
            if(calculateSumOfDigits(i) % 2 == 0)
                k++;

        return k;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number between 1 and 200: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a , b)));

        int n = scanner.nextInt();
        int[] prime = new int[n];
        int contor = n, number = 3;
        prime[0] = 2;
        int i = 1;

        while(contor != 0 && i < n) {
            if (isPrimeNumber(number)) {
                prime[i] = number;
                i++;
                contor--;
            }
            number = number + 2;
        }
        for( i = 0; i< n; i++)
            System.out.println(prime[i] + " ");

        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(prime));
    }
}
