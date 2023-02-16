package utils;

import numbers.ThreeDigitsNumber;

public interface TextNumbersName {
    String getOne(int number);

    String getWomenOne(int number);

    String getElevenNineteen(int number);

    String getTen(int number);

    String getHundred(int number);

    String rightCategoryName(Categories category, ThreeDigitsNumber threeDigitsNumber);

    String addCurrencyName(String resultInWords, ThreeDigitsNumber threeDigitsNumber);

    String rightCurrencyName(ThreeDigitsNumber threeDigitsNumber);
}
