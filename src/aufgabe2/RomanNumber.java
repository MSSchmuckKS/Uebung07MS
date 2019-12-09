package aufgabe2;

public class RomanNumber implements Number {
    private static String roman = "IVXLCDM";
    public String value;

    /**
     * constructor that sets the value of the roman number
     * @param VALUE a string consisting of roman numerals
     */
    RomanNumber(final String VALUE) {
        this.value = VALUE;
    }


    public int toIntValue() {
        int value = 0;
        int charIndex;
        int x;
        int y;

        for (int i = 0; i < this.value.length(); i++) {
            charIndex = roman.indexOf(this.value.charAt(i));
            x = (int) (charIndex + 1) / 2;
            y = charIndex % 2 == 0 ? x : x - 1;

            value += Math.pow(5, x) * Math.pow(2, y);
        }

        return value;
    }

    public void fromIntValue(int value) {
        String newValue = "";
        int[] values = new int[] {1000, 500, 100, 50, 10, 5, 1};

        for (int i = 0; i < values.length; i++) {
            for (int x = 0; x < value / values[i]; x++) {
                newValue = newValue + roman.charAt(roman.length() - i - 1);
            }
            value %= values[i];
        }

        this.value = newValue;
    }

}
