import numbers.FullNumber;
import numbers.ThreeDigitsNumber;

public interface Parser {
    FullNumber parseInput(Integer input);

    ThreeDigitsNumber parseThreeDigits(String threeDigits);
}
