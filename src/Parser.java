public class Parser {


    public Number parseInput(Integer input) {
        Digit digit = new Digit();
        Number resultNumber = new Number();
        String numberString = input.toString();

        for (int i = 0; i < numberString.length(); i++) {
            digit.setValue(Integer.parseInt(numberString.substring(i, i + 1)));
            digit.setPosition(numberString.length() - (i));
            resultNumber.addDigit(digit);
//            System.out.println(digit);
        }

        return resultNumber;
    }

    public int lastDigitParse(int input) {
        if (input > 0) {
            return input % 10;
        }
        return 0;
    }

}
