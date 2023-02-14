package utils;

import numbers.ThreeDigitsNumber;

public class Utils {
    public static String getOne(int number) {
        return switch (number) {
            case 0 -> "";
            case 1 -> "один ";
            case 2 -> "два ";
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

    public static String getElevenNineteen(int number) {
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


    public static String getTen(int number) {
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

    public static String getHundred(int number) {
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

    public static String addThousand(String resultInWords) {
        return resultInWords + "тысяча";
    }

    public static String addThousands(String resultInWords) {
        return resultInWords + "тысяч";
    }

    public static String addThousands2(String resultInWords) {
        return resultInWords + "тысячи";
    }

    public static String addMillion(String resultInWords) {
        return resultInWords + "миллион";
    }

    public static String addMillions(String resultInWords) {
        return resultInWords + "миллионов";
    }

    public static String addMillions2(String resultInWords) {
        return resultInWords + " миллиона";
    }

    public static String addBillion(String resultInWords) {
        return resultInWords + "миллиард";
    }

    public static String addBillions(String resultInWords) {
        return resultInWords + "миллиардов";
    }

    public static String addBillions2(String resultInWords) {
        return resultInWords + "миллиарда";
    }

    public static String rightCategoryName(Categories category, ThreeDigitsNumber threeDigitsNumber) {
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

    public static String addCurrencyName(String resultInWords, ThreeDigitsNumber threeDigitsNumber) {
        return resultInWords + rightCurrencyName(threeDigitsNumber);
    }

    public static String rightCurrencyName(ThreeDigitsNumber threeDigitsNumber) {
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
