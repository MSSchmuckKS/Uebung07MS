package aufgabe1;

public class StringUtils {

    /**
     * returns string where all SEARCH strings in the SOURCE sting with the REPLACE
     * string
     *
     * @param SOURCE  the string containing the strings to be replaced
     * @param SEARCH  the string in SOURCE to be replaced
     * @param REPLACE the string that will replace SEARCH
     * @return string where all SEARCH strings in the SOURCE sting were replaced
     *         with the REPLACE string
     */
    static String replace(final String SOURCE, final String SEARCH, final String REPLACE) {
        String returnString = SOURCE;
        String prefix;
        String postfix;
        int index;

        while (returnString.indexOf(SEARCH) != -1) {
            index = returnString.indexOf(SEARCH);
            prefix = index == 0 ? "" : returnString.substring(0, index);
            postfix = index == returnString.length() ? "" : returnString.substring(index + SEARCH.length());
            returnString = prefix + REPLACE + postfix;
        }

        return returnString;
    }


    /**
     * Checks whether a string is a palindrome (a phrase that's the same read forwards and backwards) while
     * ignoring letter-casing as well as punctuation and spaces in between words.
     * @param string    The string to be checked.
     * @return          true if <code>string</code> is palindrome, false otherwise
     */
    public static boolean isPalindrome(String string) {
        boolean check = true;
        String test = string.toLowerCase();
        int start = 0;
        int finish = test.length() - 1;

        while (check == true && start < finish) {
            // skipping letters
            while (!Character.isLetter(test.charAt(start))) {
                start++;
            }
            while (!Character.isLetter(test.charAt(finish))) {
                finish--;
            }
            check = test.charAt(start) == test.charAt(finish);
            start++;
            finish--;
        }
        return check;
    }


    /**
     * Checks if the characters of a string are ascending (a-z) or descending (z-a) while ignoring lower and upper case
     * from the lowest to the highest index.
     * @param string     the string to check
     * @param ascending  <code>true</code> for ascending, <code>false</code> for descending
     * @return           <code>true</code> if the string is ascending/descending;
     *                   <code>false</code> otherwise
     */
    public static boolean isSorted(String string, boolean ascending) {
        String lowerCase = string.toLowerCase();
        char lastChar = lowerCase.charAt(0);

        // Compare all characters of the string
        for (char c : lowerCase.toCharArray()) {
            // Compare the integer values of the characters
            if ((ascending && c < lastChar) || (!ascending && c > lastChar))
                return false;

            // Save the character to compare it with the character of the next iteration
            lastChar = c;
        }

        return true;
    }
}