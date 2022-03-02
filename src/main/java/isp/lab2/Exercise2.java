package isp.lab2;

import java.util.Scanner;

/**
 * Check readme.md file for the exercise requirements.
 *
 * @author Radu Miron
 */
public class Exercise2 {
    /**
     * Reads an enumeration of words separated by comma.
     *
     * @return The console input enumeration if it's valid, null otherwise.
     */
    public static String readEnumeration() {
        System.out.println("Please input an enumeration of words separated by comma:");

        Scanner scanner = new Scanner(System.in);
        String enumeration = scanner.nextLine();

        if (enumeration.trim().length() > 0) {
            return enumeration;
        } else {
            return null;
        }
    }

    /**
     * Reads the searched words starting letter.
     *
     * @return The starting character if it's a valid letter, null otherwise.
     */
    public static Character readStartingLetter() {
        System.out.println("Please input the starting letter of the words you want to search:");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.length() > 0) {
            return line.charAt(0);
        } else {
            return null;
        }
    }

    /**
     * Splits a given {@link String} by comma.
     * TODO: Use {@link String#split(String splitBy)} to split the enumeration;
     * TODO: If you plan on using also whitespace characters in your enumeration (eg. " apple , cat, mouse"), use {@link String#trim()} for each word.
     *
     * @param inputEnumeration The words' enumeration.
     * @return An array of words.
     */
    public static String[] splitEnumerationIntoWords(String inputEnumeration) {
        String[] words = inputEnumeration.split(",", -1);

        return words;
    }

    /**
     * Finds the words starting with a given letter in an array.
     *
     * @param words          The array of words.
     * @param startingLetter The starting letter.
     * @return All the words starting with the given letter.
     */
    public static String[] findWordsStartingWith(String[] words, Character startingLetter) {
        int nr=0; //pentru numarul de cuvinte care respecta conditia
        for(String word : words)
            if(word.charAt(0) == startingLetter){
                nr++;
                System.out.println(word);
            }
        String[] result = new String[nr];
        nr=0; //folosit mai mult ca index
        for(String word : words)
            if(word.charAt(0) == startingLetter)
                result[nr] = word;
        return result;
    }

    public static void main(String[] args) {
        String enumeration = readEnumeration();
        Character startingLetter = readStartingLetter();

        if (enumeration != null && startingLetter != null) {
            String[] words = splitEnumerationIntoWords(enumeration);
            String[] results = findWordsStartingWith(words, startingLetter);

        } else {
            if(enumeration == null)
                System.out.println("This enumeration is invalid");
            if(startingLetter == null)
                System.out.println("The strating letter is invalid");

        }
    }
}



