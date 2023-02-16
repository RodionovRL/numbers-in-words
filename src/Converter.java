import numbers.FullNumber;
import numbers.ThreeDigitsNumber;
import utils.Categories;

public interface Converter {
    String convertThreeDigitsInWords(ThreeDigitsNumber threeDigitsNumber, Categories category);

    String convertFullNumberInWords(FullNumber fullNumber);
}
