import org.junit.Assert;
import org.junit.Test;
import aufgabe1.StringOperations;


public class StringOperationsTest {

    @Test
    public void replace() {
        String replace1 = StringOperations.replace("The very hungry caterpillar", "ater", "thulhu");
        Assert.assertEquals("The very hungry cthulhupillar", replace1);

        String replace2 = StringOperations.replace("The Adventures of Tom Sawyer", "S", "L");
        Assert.assertEquals("The Adventures of Tom Lawyer", replace2);

        String replace3 = StringOperations.replace("Pretty Woman", "r", "");
        Assert.assertEquals("Petty Woman", replace3);

        String replace4 = StringOperations.replace("True Grit", "R", "");
        Assert.assertEquals("True Grit", replace4);
    }

    @org.junit.Test
    public void isPalindrome() {
        Assert.assertTrue(StringOperations.isPalindrome("o"));

        Assert.assertTrue(StringOperations.isPalindrome("Ebbe"));

        Assert.assertFalse(StringOperations.isPalindrome("Array"));

        Assert.assertTrue(StringOperations.isPalindrome("Al lets Della call Ed 'Stella'."));

    }

    @org.junit.Test
    public void isSorted() {
        // ascending
        Assert.assertTrue(StringOperations.isSorted("bijoux", true));

        Assert.assertFalse(StringOperations.isSorted("Racecar", true));

        // descending
        Assert.assertFalse(StringOperations.isSorted("cbaZYX", false));

        Assert.assertTrue(StringOperations.isSorted("Spoonfeed", false));
    }
}