package aufgabe1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StringUtilsTest {

    @Test
    void replace() {
        // Test 1
        String replaced1 = StringUtils.replace("The very hungry caterpillar", "ater", "thulhu");
        Assertions.assertEquals("The very hungry cthulhupillar", replaced1);

        // Test 2
        String replaced2 = StringUtils.replace("The Adventures of Tom Sawyer", "S", "L");
        Assertions.assertEquals("The Adventures of Tom Lawyer", replaced2);

        // Test 3
        String replaced3 = StringUtils.replace("Pretty Woman", "r", "");
        Assertions.assertEquals("Petty Woman", replaced3);

        // Test 4
        String replaced4 = StringUtils.replace("True Grit", "R", "");
        Assertions.assertEquals("True Grit", replaced4);
    }

    @Test
    void isPalindrome() {
        // Test 1
        Assertions.assertTrue(StringUtils.isPalindrome("o"));

        // Test 2
        Assertions.assertTrue(StringUtils.isPalindrome("Ebbe"));

        // Test 3
        Assertions.assertFalse(StringUtils.isPalindrome("Array"));

        // Test 4
        Assertions.assertTrue(StringUtils.isPalindrome("Al lets Della call Ed 'Stella'."));
    }

    @Test
    void isSorted() {
        // Test 1
        Assertions.assertTrue(StringUtils.isSorted("bijoux", true));

        // Test 2
        Assertions.assertFalse(StringUtils.isSorted("Racecar", true));

        // Test 3
        Assertions.assertFalse(StringUtils.isSorted("cbaZYX", false));

        // Test 4
        Assertions.assertTrue(StringUtils.isSorted("Spoonfeed", false));
    }
}