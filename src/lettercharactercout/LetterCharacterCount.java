/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lettercharactercout;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LetterCharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the strings: ");
        String input = scanner.nextLine();
        scanner.close();
        input = input.toLowerCase();

        Map<String, Integer> letterFrequency = new HashMap<>();
        Map<Character, Integer> charFrequency = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            letterFrequency.put(word, letterFrequency.getOrDefault(word, 0) + 1);

            for (char c : word.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(letterFrequency);
        System.out.println(charFrequency);
    }
}
