package numbers;

public class ThreeDigitsNumber {
    Digit digitOne;
    Digit digitTen;
    Digit digitHundred;



    public ThreeDigitsNumber() {
    }

    public void setDigitOne(Digit digitOne) {
        this.digitOne = digitOne;
    }

    public void setDigitTen(Digit digitTen) {
        this.digitTen = digitTen;
    }

    public void setDigitHundred(Digit digitHundred) {
        this.digitHundred = digitHundred;
    }


    public Digit getDigitOne() {
        return digitOne;
    }

    public Digit getDigitTen() {
        return digitTen;
    }

    public Digit getDigitHundred() {
        return digitHundred;
    }

}
