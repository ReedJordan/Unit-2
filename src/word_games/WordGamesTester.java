package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a random word: ");
        String text = input.nextLine();
        WordGames wordplay = new WordGames(text);
        // Scramble it
        // Print out scrambled word
        wordplay.scramble();
        String firstMix = wordplay.scramble();
        System.out.println(firstMix);
        // Ask for an index
        // Ask for random word
        /*System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        */
        // Add random word at index
        // Print out the word


        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word

    }
}
