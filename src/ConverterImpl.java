import numbers.FullNumber;
import numbers.ThreeDigitsNumber;

public interface ConverterImpl {
    String convertThreeDigitsInWords(ThreeDigitsNumber threeDigitsNumber);

    String convertFullNumberInWords(FullNumber fullNumber);
}
