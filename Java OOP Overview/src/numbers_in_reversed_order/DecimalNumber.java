package numbers_in_reversed_order;

import java.text.DecimalFormat;

public class DecimalNumber {
    private double number;
    private DecimalFormat format = new DecimalFormat();

    private void setNumber(double number) {
        format.setDecimalSeparatorAlwaysShown(false);
        format.format(this.number);
        this.number = number;
    }

    private double getNumber() {
        return this.number;
    }

    public DecimalNumber(double number) {
        this.setNumber(number);
    }

    public StringBuffer getAllDigitsReversed() {
        StringBuffer output = new StringBuffer();
        char[] digits = String.valueOf(format.format(this.getNumber())).toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            output.append(digits[i]);
        }
        return output;
    }
}
