package languagepack;

import api.services.LanguagePack;
import numbers.ThreeDigitsNumber;
import utils.Categories;

public class RussianLanguagePack implements LanguagePack {

    @Override
    public String askUserInput() {
        return "Введите сумму от 1 до 2 147 483 647 (без пробелов)";
    }

    @Override
    public String getInputErrorMessage() {
        return "Вы ввели что-то непотребное";
    }
    @Override
    public  String getLessOneMessage(){
        return "Необходимо ввести целое положительное число!";
    }

    @Override
    public String getOne(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "один ";
            case 2 -> "два ";
            default -> getThreeToNine(number);
        };
    }

    @Override
    public String getWomenOne(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "одна ";
            case 2 -> "две ";
            default -> getThreeToNine(number);
        };
    }

    private String getThreeToNine(int number) {
        return switch (number) {
            case 3 -> "три ";
            case 4 -> "четыре ";
            case 5 -> "пять ";
            case 6 -> "шесть ";
            case 7 -> "семь ";
            case 8 -> "восемь ";
            case 9 -> "девять ";
            default -> "сколько-то";
        };
    }

    @Override
    public String getElevenNineteen(int number) {
        return switch (number) {
            case 1 -> "одиннадцать ";
            case 2 -> "двенадцать ";
            case 3 -> "тринадцать ";
            case 4 -> "четырнадцать ";
            case 5 -> "пятнадцать ";
            case 6 -> "шестнадцать ";
            case 7 -> "семнадцать ";
            case 8 -> "восемнадцать ";
            case 9 -> "девятнадцать ";
            default -> "сколько-то";
        };
    }


    @Override
    public String getTen(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "десять ";
            case 2 -> "двадцать ";
            case 3 -> "тридцать ";
            case 4 -> "сорок ";
            case 5 -> "пятьдесят ";
            case 6 -> "шестьдесят ";
            case 7 -> "семьдесят ";
            case 8 -> "восемьдесят ";
            case 9 -> "девяносто ";
            default -> "сколько-то";
        };
    }

    @Override
    public String getHundred(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "сто ";
            case 2 -> "двести ";
            case 3 -> "триста ";
            case 4 -> "четыреста ";
            case 5 -> "пятьсот ";
            case 6 -> "шестьсот ";
            case 7 -> "семьсот ";
            case 8 -> "восемьсот ";
            case 9 -> "девятьсот ";
            default -> "сколько-то";
        };
    }

    private String addThousand(String resultInWords) {
        return resultInWords + "тысяча";
    }

    private String addThousands(String resultInWords) {
        return resultInWords + "тысяч";
    }

    private String addThousands2(String resultInWords) {
        return resultInWords + "тысячи";
    }

    private String addMillion(String resultInWords) {
        return resultInWords + "миллион";
    }

    private String addMillions(String resultInWords) {
        return resultInWords + "миллионов";
    }

    private String addMillions2(String resultInWords) {
        return resultInWords + " миллиона";
    }

    private String addBillion(String resultInWords) {
        return resultInWords + "миллиард";
    }

    private String addBillions(String resultInWords) {
        return resultInWords + "миллиардов";
    }

    private String addBillions2(String resultInWords) {
        return resultInWords + "миллиарда";
    }

    @Override
    public String rightCategoryName(Categories category, ThreeDigitsNumber threeDigitsNumber) {
        String rightCategoryName = "";
        switch (threeDigitsNumber.getDigitOne().getValue()) {
            case 1 -> {
                if (threeDigitsNumber.getDigitTen().getValue() == 1) {
                    switch (category) {
                        case THOUSANDS -> rightCategoryName = addThousands(rightCategoryName);
                        case MILLIONS -> rightCategoryName = addMillions(rightCategoryName);
                        case BILLIONS -> rightCategoryName = addBillions(rightCategoryName);
                    }
                } else {
                    switch (category) {
                        case THOUSANDS -> rightCategoryName = addThousand(rightCategoryName);
                        case MILLIONS -> rightCategoryName = addMillion(rightCategoryName);
                        case BILLIONS -> rightCategoryName = addBillion(rightCategoryName);
                    }
                }
            }
            case 2, 3, 4 -> {
                if (threeDigitsNumber.getDigitTen().getValue() == 1) {
                    switch (category) {
                        case THOUSANDS -> rightCategoryName = addThousands(rightCategoryName);
                        case MILLIONS -> rightCategoryName = addMillions(rightCategoryName);
                        case BILLIONS -> rightCategoryName = addBillions(rightCategoryName);
                    }
                } else {
                    switch (category) {
                        case THOUSANDS -> rightCategoryName = addThousands2(rightCategoryName);
                        case MILLIONS -> rightCategoryName = addMillions2(rightCategoryName);
                        case BILLIONS -> rightCategoryName = addBillions2(rightCategoryName);
                    }
                }
            }
            default -> {
                switch (category) {
                    case THOUSANDS -> rightCategoryName = addThousands(rightCategoryName);
                    case MILLIONS -> rightCategoryName = addMillions(rightCategoryName);
                    case BILLIONS -> rightCategoryName = addBillions(rightCategoryName);
                }
            }
        }
        return rightCategoryName;
    }

    @Override
    public String addCurrencyName(String resultInWords, ThreeDigitsNumber threeDigitsNumber) {
        return resultInWords + rightCurrencyName(threeDigitsNumber);
    }

    @Override
    public String rightCurrencyName(ThreeDigitsNumber threeDigitsNumber) {
        return switch (threeDigitsNumber.getDigitOne().getValue()) {
            case 1:
                if (threeDigitsNumber.getDigitTen().getValue() != 1) {
                    yield "рубль";
                }
            case 2, 3, 4:
                if (threeDigitsNumber.getDigitTen().getValue() != 1) {
                    yield "рубля";
                }
            default:
                yield "рублей";
        };
    }


}
