import numbers.FullNumber;
import numbers.ThreeDigitsNumber;

public interface ParserImpl {
    FullNumber parseInput(Integer input);

    ThreeDigitsNumber parseThreeDigits(String threeDigits);
}
