import numbers.FullNumber;
import utils.Utils;

public class ConvertManager {
    ConverterImpl converter = new Converter();
    ParserImpl parser = new Parser();
    FullNumber parsedFullNumber = new FullNumber();



    public String addCurrencyToNumber(int userNumber){
        parsedFullNumber = parser.parseInput(userNumber);
        return userNumber + " " + Utils.rightCurrencyName(parsedFullNumber.getOnes());
    }

    public String number


}
