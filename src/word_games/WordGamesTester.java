package word_games;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //THIS PART WORKS
        // Ask for a word
        System.out.println("Enter a random word: ");
        String chosenWord = input.nextLine();
        //Scramble it
        WordGames newGames = new WordGames(chosenWord);
        String scrambled = newGames.scramble();
        // Print out scrambled word
        System.out.println(scrambled);
        //THIS PART WORKS

        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer greater than " +chosenWord.length()+ ": ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String addWord = input.nextLine();

        // Add random word at index
        String splitBana = newGames.bananaSplit(idx, addWord);
        // Print out the word
        System.out.println(splitBana);

        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter a character that is part of your word: ");
        String pickChar = input.nextLine();
        System.out.println("Enter another word: ");
        String bonusWord = input.nextLine();

        String thirdMix = newGames.bananaSplit(pickChar, bonusWord);
        System.out.println(thirdMix);

        String ender = newGames.toString();
        System.out.println(ender);
        
        
    }
}
