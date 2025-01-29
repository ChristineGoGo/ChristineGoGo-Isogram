import java.util.Map;
import java.util.HashMap;


public class Isogram {
    /**
     * create a Map of all the alphabet letters with a count of 0
     * @return Map of all the lowercase alphabet characters with count of each letter being 0
     */
    public Map<String, Integer> getAlphabet() {
        Map<String, Integer> alphabets = new HashMap<>();
        char currentChar = 97;
        String currentString = "";

        for (int i = 0; i < 26; i++) {
            currentString += currentChar;
            alphabets.put(currentString,0);
            currentChar += 1;
            currentString = "";
        }
        return alphabets;
    }
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        // return false;
        Map<String, Integer> alphabetFrequency = new HashMap<>(getAlphabet());
        char currentChar;
        int currentCount = 0;
        String currentString = "";

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            currentString += currentChar;
            currentCount = alphabetFrequency.get(currentString);
            currentCount += 1;
            alphabetFrequency.put(currentString, currentCount);

            if (currentCount > 1) {
                return false;
            }
            currentString = "";

        }
        return true;

    }
}
