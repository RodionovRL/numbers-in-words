import numbers.FullNumber;
import utils.TextNumbersName;

public class ConvertManagerImpl implements ConvertManager {
    Converter converter;
    Parser parser;
    TextNumbersName numbersName;

    public ConvertManagerImpl(Parser parser, Converter converter, TextNumbersName numbersName) {
        this.converter = converter;
        this.parser = parser;
        this.numbersName = numbersName;
    }

    private FullNumber parseUserNumber(int userNumber) {
        return parser.parseInput(userNumber);
    }

    @Override
    public String addCurrencyToNumber(int userNumber) {
        return userNumber + " " + numbersName.rightCurrencyName(parseUserNumber(userNumber).getOnes());
    }

    @Override
    public String convertNumberToWords(int userNumber) {
        return converter.convertFullNumberInWords(parseUserNumber(userNumber));
    }


}
