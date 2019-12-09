import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import aufgabe2.RomanNumber;

public class NumberTest {

    @Test
    public void toIntValue() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVII");
        RomanNumber c = new RomanNumber("VII");
        RomanNumber d = new RomanNumber("DCXVI");

        Assertions.assertEquals(20, a.toIntValue());

        Assertions.assertEquals(1107, b.toIntValue());

    }

    @Test
    public void fromIntValue() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVII");
        RomanNumber c = new RomanNumber("VII");
        RomanNumber d = new RomanNumber("DCXVI");

        c.fromIntValue(20);
        Assertions.assertEquals("XX", c.getRvalue());

        d.fromIntValue(3699);
        Assertions.assertEquals("MMMDCLXXXXVIIII", d.getRvalue());
    }

    @Test
    public void add() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVII");
        RomanNumber c = new RomanNumber("VII");
        RomanNumber d = new RomanNumber("DCXVI");

        a.add(d);
        Assertions.assertEquals("DCXXXVI", a.getRvalue());

        b.add(c);
        Assertions.assertEquals("MCXIIII", b.getRvalue());


    }

    @Test
    public void subtract() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVII");
        RomanNumber c = new RomanNumber("VII");
        RomanNumber d = new RomanNumber("DCXVI");

        d.subtract(a);
        Assertions.assertEquals("DLXXXXVI", d.getRvalue());

        b.subtract(c);
        Assertions.assertEquals("MC", b.getRvalue());

        a.subtract(b);
        Assertions.assertEquals("", a.getRvalue());

    }

    @Test
    public void multiply() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVII");
        RomanNumber c = new RomanNumber("VII");
        RomanNumber d = new RomanNumber("II");

        a.multiply(c);
        Assertions.assertEquals("CXXXX", a.getRvalue());

        b.multiply(d);
        Assertions.assertEquals("MMCCXIIII", b.getRvalue());

    }

    @Test
    public void divide() {
        RomanNumber a = new RomanNumber("XX");
        RomanNumber b = new RomanNumber("DDCVIII");
        RomanNumber c = new RomanNumber("V");
        RomanNumber d = new RomanNumber("II");

        a.divide(c);
        Assertions.assertEquals("IIII", a.getRvalue());

        b.divide(d);
        Assertions.assertEquals("DLIIII", b.getRvalue());

    }
}