package aufgabe2;

public class RomanNumber implements Number {
    private String rvalue;
    private char[] rnumbers = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    private int[] rint = new int[] {1, 5, 10, 50, 100, 500, 1000};

    public RomanNumber(final String RVALUE) {
        this.rvalue = RVALUE;
    }



    public int toIntValue() {
        int temp = 0;

        // string is empty
        if (rvalue.equals("")) {
            return 0;
        }

        else {
            for (int i = rvalue.length() - 1; i >= 0; i--) {
                for (int k = 0; k < rnumbers.length; k++) {
                    if (rvalue.charAt(i) == rnumbers[k]) {
                        temp = temp + rint[k];
                        break;
                    }
                }
            }
            return temp;
        }

    }

    public String getRvalue() {
        return rvalue;
    }



    public void fromIntValue(int value) {
        int temp = value;
        String newNumber = "";

        // value is <= 0
        if (value <= 0) {
            this.rvalue = newNumber;
        }

        // value is > 0
        else {
            for (int i = 0; i < rvalue.length(); i++) {
                for (int k = rint.length - 1; k >= 0; k--) {
                    while (temp >= rint[k]) {
                        newNumber += rnumbers[k];
                        temp -= rint[k];
                    }
                }
            }
        } this.rvalue = newNumber;
    }
}
