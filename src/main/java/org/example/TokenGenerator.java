package org.example;

import java.util.Random;

public class TokenGenerator {
    public static void main(String[] args) {
        int num = 5; // Number of terms in the sequence
        String sequence = generateSequence(num);
        System.out.println("Sequence: " + sequence);

        String token = generateRandomToken();
        System.out.println("Random Token: " + token);

        String selectedNumber = selectNumberFromSequence(sequence);
        System.out.println("Selected Number: " + selectedNumber);

        String concatenatedString = selectedNumber + token;
        System.out.println("Concatenated String: " + concatenatedString);

        String finalString = replaceEveryThirdCharacter(concatenatedString);
        System.out.println("Final String: " + finalString);
    }

    private static String generateSequence(int num) {
        StringBuilder sequence = new StringBuilder("1");
        for (int i = 1; i < num; i++) {
            StringBuilder nextTerm = new StringBuilder();
            int count = 1;
            char currentDigit = sequence.charAt(0);

            for (int j = 1; j < sequence.length(); j++) {
                if (sequence.charAt(j) == currentDigit) {
                    count++;
                } else {
                    nextTerm.append(count).append(currentDigit);
                    currentDigit = sequence.charAt(j);
                    count = 1;
                }
            }

            nextTerm.append(count).append(currentDigit);
            sequence = nextTerm;
        }

        return sequence.toString();
    }

    private static String generateRandomToken() {
        int length = 10; // Length of the random token
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder token = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            token.append(characters.charAt(index));
        }

        return token.toString();
    }

    private static String selectNumberFromSequence(String sequence) {
        Random random = new Random();
        int index = random.nextInt(sequence.length());
        return String.valueOf(sequence.charAt(index));
    }

    private static String replaceEveryThirdCharacter(String input) {
        StringBuilder result = new StringBuilder(input);
        for (int i = 2; i < result.length(); i += 3) {
            result.setCharAt(i, 'X');
        }
        return result.toString();
    }
}
