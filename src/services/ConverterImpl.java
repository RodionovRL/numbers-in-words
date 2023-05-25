package services;

import api.services.Converter;
import numbers.FullNumber;
import numbers.ThreeDigitsNumber;
import utils.Categories;
import api.services.LanguagePack;

public class ConverterImpl implements Converter {
    LanguagePack numbersName;

    public ConverterImpl(LanguagePack numbersName) {
        this.numbersName = numbersName;
    }

    @Override
    public String convertThreeDigitsInWords(ThreeDigitsNumber threeDigitsNumber, Categories category) {
        StringBuilder resultInWords = new StringBuilder();

        resultInWords.append(numbersName.getHundred(threeDigitsNumber.getDigitHundred().getValue()));
        if (threeDigitsNumber.getDigitTen().getValue() == 1) {
            resultInWords.append(numbersName.getElevenNineteen(threeDigitsNumber.getDigitOne().getValue()));
        } else {

            resultInWords.append(numbersName.getTen(threeDigitsNumber.getDigitTen().getValue()));
            if (category == Categories.THOUSANDS) {
                resultInWords.append(numbersName.getWomenOne(threeDigitsNumber.getDigitOne().getValue()));
            } else {
                resultInWords.append(numbersName.getOne(threeDigitsNumber.getDigitOne().getValue()));
            }
        }
        return resultInWords.toString();
    }

    @Override
    public String convertFullNumberInWords(FullNumber fullNumber) {
        StringBuilder fullNumberInWords = new StringBuilder();
        if (fullNumber.getBillions() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getBillions(), Categories.BILLIONS));
            fullNumberInWords.append(numbersName.rightCategoryName(Categories.BILLIONS, fullNumber.getBillions())).append(" ");
        }
        if (fullNumber.getMillions() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getMillions(), Categories.MILLIONS));
            fullNumberInWords.append(numbersName.rightCategoryName(Categories.MILLIONS, fullNumber.getMillions())).append(" ");
        }
        if (fullNumber.getThousands() != null) {
            fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getThousands(), Categories.THOUSANDS));
            fullNumberInWords.append(numbersName.rightCategoryName(Categories.THOUSANDS, fullNumber.getThousands())).append(" ");
        }
        fullNumberInWords.append(convertThreeDigitsInWords(fullNumber.getOnes(), Categories.ONES));
        fullNumberInWords.append(numbersName.addCurrencyName("", fullNumber.getOnes()));

        return fullNumberInWords.toString();
    }
}