public class PalindromeCheckerProgram{

    public static void main(String[] args) {

        
    }

    public static boolean isAnagram (String firstWord, String secondWord) {

        String word1 = removeSpaces(firstWord);
        String word2 = removeSpaces(secondWord);

        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length != word2Length) {
            return false;
        }


            return true;
    }

    public static String removeSpaces (String input){
        return input.replaceAll("\\s","");
    }

    public static int[] checkLetters (String input){
        int[] amountOfLetters = new int[26];
        return(amountOfLetters);
    }

}