package word_games;

/**
 * The Word Games project directed in class
 * @Reed Jordan
 * AP Comp Sci A w/ Mr. Smith
 * 10/11/24
 */
public class WordGames
{
    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
        // switch first half
        // and second half
        
        word = text;
        
        int numCharacters = word.length();
        int halfPoint = numCharacters / 2;
        String firstHalf = word.substring(0, halfPoint);
        String secondHalf = word.substring(halfPoint);
        
        String shaken = secondHalf + firstHalf;
        
        
        return shaken;

    }
    
    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        // insertIdx
        int splitPoint = insertIdx;
        String midWord = insertText;
        
        String partOne = word.substring(0, splitPoint);
        String partTwo = word.substring(splitPoint);
        
        String splitBanana = partOne + midWord + partTwo;
        
        return splitBanana;

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        
        String splitChara = insertChar;
        String plusWord = insertText;
        
        int newPoint = word.indexOf(splitChara);
        String halfOne = word.substring(0,newPoint);
        String halfTwo = word.substring(newPoint);
        String newSplit = halfOne + plusWord + halfTwo;
        
        return newSplit;

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "[" word "]";

    }
    
}
