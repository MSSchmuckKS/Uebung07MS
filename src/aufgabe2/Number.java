package aufgabe2;

public interface Number {

    /**
     * Returns the numeric value of one given object as an integer.
     * @return      the numeric value of the object
     */
    public int toIntValue();

    /**
     * Gives an object the value of the integer <code>value</code>.
     * @param value     the integer that holds the new value of the object
     */
    public void fromIntValue(int value);


    /**
     * Adds the value of <code>number</code> to the value of an object.
     * @param number
     */
    default public void add(Number number) {
        fromIntValue(toIntValue() + number.toIntValue());
    }

    /**
     * Subtracts the value of <code>number</code> off the value of an object.
     * @param number    the value to be subtracted off
     */
    default public void subtract(Number number) {
        fromIntValue(toIntValue() - number.toIntValue());
    }

    /**
     * Multiplies the value of and object with <code>number</code>.
     * @param number    the factor
     */
    default public void multiply(Number number) {
        fromIntValue(toIntValue() * number.toIntValue());
    }

    /**
     * Divides the value an object with <code>number</code>.
     * @param number    the divisor
     */
    default public void divide(Number number) {
        fromIntValue(toIntValue() / number.toIntValue());
    }
}
