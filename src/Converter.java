import numbers.FullNumber;
import numbers.ThreeDigitsNumber;
import utils.Categories;
import utils.Utils;

public class Converter implements ConverterImpl {
    @Override
    public String convertThreeDigitsInWords(ThreeDigitsNumber threeDigitsNumber) {
        StringBuilder resultInWords = new StringBuilder();

        resultInWords.append(Utils.getHundred(threeDigitsNumber.getDigitHundred().getValue()));//.append(" ");
        if (threeDigitsNumber.getDigitTen().getValue() == 1) {
            resultInWords.append(Utils.getElevenNineteen(threeDigitsNumber.getDigitOne().getValue()));
        } else {
            resultInWords.append(Utils.getTen(threeDigitsNumber.getDigitTen().getValue()));//.append(" ");
            resultInWords.append(Utils.getOne(threeDigitsNumber.getDigitOne().getValue()));
        }
        return resultInWords.toString();
    }

    @Override
    public String convertFullNumberInWords(FullNumber fullNumber) {
        StringBuilder fullNumberInWords = new StringBuilder();
        if (fullNumber.getBillions() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getBillions()));//.append(" ");
            fullNumberInWords.append(Utils.rightCategoryName(Categories.BILLIONS, fullNumber.getBillions())).append(" ");
        }
        if (fullNumber.getMillions() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getMillions()));//.append(" ");
            fullNumberInWords.append(Utils.rightCategoryName(Categories.MILLIONS, fullNumber.getMillions())).append(" ");
        }
        if (fullNumber.getThousands() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getThousands()));//.append(" ");
            fullNumberInWords.append(Utils.rightCategoryName(Categories.THOUSANDS, fullNumber.getThousands())).append(" ");
        }
        fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getOnes()));//.append(" ");
        fullNumberInWords.append(Utils.addCurrencyName("", fullNumber.getOnes()));//.append(" ");

        return fullNumberInWords.toString();
    }
}