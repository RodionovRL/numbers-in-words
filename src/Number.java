import java.util.ArrayList;
import java.util.List;

public class Number {
    List<Digit> digits;

    public Number() {
        digits = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Number{" +
                "digits=" + digits +
                '}';
    }

    public void addDigit(Digit digit) {
        digits.add(digit);
    }


    public Digit getDigit(int numOfDigit) {
        return digits.get(numOfDigit);
    }

    public int numOfDigits(){
        return digits.size();
    }
}
