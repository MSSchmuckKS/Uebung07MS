package aufgabe1;

public class StringOperations {

    /**
     * Replaces all instances of the string <code>search</code> (if they exist) in the string <code>source</code> with the string <code>replace</code>.
     * @param source        the base string that is to be changed
     * @param search        the string that will be replaced
     * @param replace       the string that replaces the string <code>search</code>
     * @return              the manipulated string with all replacements
     */
    public static String replace(String source, String search, String replace) {
        int index = source.indexOf(search, 0);

        // source does not contain string search
        if (index == -1) {
            return source;
        }

        // source does not contain string search at least once
        else {
            String newString = "";
            int move = 0;

            // makes it possible to check for multiple instances of search
            while (index != -1) {
                newString = newString + source.substring(move, index) + replace;
                move = index + search.length();
                index = source.indexOf(search, index + 1);
            }

            return newString + source.substring(move);
        }
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
     * Checks whether a single word is sorted in an ascending or a descending manner, ignoring letter-casing.
     * @param string            the word to be checked
     * @param ascending         true for checking for ascending manner, false for checking for descending manner
     * @return                  true if the word is sorted, false otherwise
     */
    public static boolean isSorted(String string, boolean ascending) {
        String test = string.toLowerCase();
        int check = 0;

        // check for ascending
        if (ascending == true) {
            if (test.charAt(check) <= test.charAt(check + 1)) {
                while (test.charAt(check) <= test.charAt(check + 1) && check + 1 < test.length() - 1) {
                    check++;
                }
                return test.charAt(check) <= test.charAt(check + 1);
            }
            else return false;
        }

        // checking for descending
        else {
            if (test.charAt(check) >= test.charAt(check + 1)) {
                while (test.charAt(check) >= test.charAt(check + 1) && check + 1 < test.length() - 1) {
                    check++;
                }
                return test.charAt(check) >= test.charAt(check + 1);
            }
            else return false;
        }
    }

}








