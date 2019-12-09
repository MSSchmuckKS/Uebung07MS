package aufgabe2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanNumberTest {
    @Test
    void add() {
        // Test 1
        RomanNumber rn = new RomanNumber("MMXI"); // 2011
        RomanNumber rn2 = new RomanNumber("XXXXII"); // 42
        rn.add(rn2); // 2011 + 42 = 2053
        Assertions.assertEquals(rn.value, "MMLIII");

        // Test 2
        RomanNumber rn3 = new RomanNumber("CCCXXXIII"); // 333
        RomanNumber rn4 = new RomanNumber("CCCCLVII"); // 457
        rn4.add(rn3); // 457 + 333 = 790
        Assertions.assertEquals(rn4.value, "DCCLXXXX");
    }

    @Test
    void subtract() {
        // Test 1
        RomanNumber rn = new RomanNumber("MMXI"); // 2011
        RomanNumber rn2 = new RomanNumber("XXXXII"); // 42
        rn.subtract(rn2); // 2011 - 42 = 1969
        Assertions.assertEquals(rn.value, "MDCCCCLXVIIII");

        // Test 2
        RomanNumber rn3 = new RomanNumber("CCCXXXIII"); // 333
        RomanNumber rn4 = new RomanNumber("CCCCLVII"); // 457
        rn4.subtract(rn3); // 457 - 333 = 124
        Assertions.assertEquals(rn4.value, "CXXIIII");
    }

    @Test
    void multiply() {
        // Test 1
        RomanNumber rn = new RomanNumber("III"); // 3
        RomanNumber rn2 = new RomanNumber("XXXXII"); // 42
        rn.multiply(rn2); // 3 * 42 = 126
        Assertions.assertEquals(rn.value, "CXXVI");

        // Test 2
        RomanNumber rn3 = new RomanNumber("XXXXVI"); // 46
        RomanNumber rn4 = new RomanNumber("LIII"); // 53
        rn4.multiply(rn3); // 46 * 53 = 2438
        Assertions.assertEquals(rn4.value, "MMCCCCXXXVIII");
    }

    @Test
    void divide() {
        // Test 1
        RomanNumber rn = new RomanNumber("III"); // 3
        RomanNumber rn2 = new RomanNumber("XXXXII"); // 42
        rn2.divide(rn); // 42 / 3 = 14
        Assertions.assertEquals(rn2.value, "XIIII");

        // Test 2
        RomanNumber rn3 = new RomanNumber("CCCCLVII"); // 455
        RomanNumber rn4 = new RomanNumber("V"); // 5
        rn3.divide(rn4); // 455 / 5 = 91
        Assertions.assertEquals(rn3.value, "LXXXXI");
    }

    @Test
    void toIntValue() {
        // Test 1
        RomanNumber rn = new RomanNumber("MMXXI");
        Assertions.assertEquals(rn.toIntValue(), 2021);

        // Test 2
        RomanNumber rn2 = new RomanNumber("");
        Assertions.assertEquals(rn2.toIntValue(), 0);
    }

    @Test
    void fromIntValue() {
        // Test 1
        RomanNumber rn = new RomanNumber("42");
        rn.fromIntValue(-435);
        Assertions.assertEquals(rn.value, "");

        // Test 2
        RomanNumber rn2 = new RomanNumber("");
        rn2.fromIntValue(338);
        Assertions.assertEquals(rn2.value, "CCCXXXVIII");
    }
}