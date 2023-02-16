import numbers.Digit;
import numbers.FullNumber;
import numbers.ThreeDigitsNumber;
import utils.Categories;

public class ParserImpl implements Parser {

    @Override
    public FullNumber parseInput(Integer input) {

        FullNumber resultThreeDigitsNumber = new FullNumber();
        StringBuilder numberInTexts = new StringBuilder(input.toString());
        for (int i = 0; i < (numberInTexts.length() % 3); i++) {
            numberInTexts.insert(0, "0");
        }

        for (int i = 0; i < numberInTexts.length(); i += 3) {
            int substringPosition = numberInTexts.length() - i;
            String threeDigitsInTexts = numberInTexts.substring(substringPosition - 3, substringPosition);

            switch (i) {
                case 0 -> resultThreeDigitsNumber
                        .addTreeDigitsNumber(Categories.ONES, parseThreeDigits(threeDigitsInTexts));
                case 3 -> resultThreeDigitsNumber
                        .addTreeDigitsNumber(Categories.THOUSANDS, parseThreeDigits(threeDigitsInTexts));
                case 6 -> resultThreeDigitsNumber
                        .addTreeDigitsNumber(Categories.MILLIONS, parseThreeDigits(threeDigitsInTexts));
                case 9 -> resultThreeDigitsNumber
                        .addTreeDigitsNumber(Categories.BILLIONS, parseThreeDigits(threeDigitsInTexts));
            }
        }
        return resultThreeDigitsNumber;
    }

    @Override
    public ThreeDigitsNumber parseThreeDigits(String threeDigits) {
        ThreeDigitsNumber resultThreeDigitsNumber = new ThreeDigitsNumber();

        for (int i = 0; i < threeDigits.length(); i++) {
            Digit digit = new Digit();
            digit.setValue(Integer.parseInt(threeDigits.substring(i, i + 1)));
            digit.setPosition(threeDigits.length() - (i));
            switch (i) {
                case 0 -> resultThreeDigitsNumber.setDigitHundred(digit);
                case 1 -> resultThreeDigitsNumber.setDigitTen(digit);
                case 2 -> resultThreeDigitsNumber.setDigitOne(digit);
            }
        }

        return resultThreeDigitsNumber;
    }
}
