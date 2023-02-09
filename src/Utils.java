public class Utils {
    public static String getOne(int number) {
        return switch (number) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            default -> "сколько-то";
        };
    }

    public static String getElevenNineteen(int number) {
        return switch (number) {
            case 1 -> "одиннадцать";
            case 2 -> "двенадцать";
            case 3 -> "тринадцать";
            case 4 -> "четырнадцать";
            case 5 -> "пятнадцать";
            case 6 -> "шестнадцать";
            case 7 -> "семнадцать";
            case 8 -> "восемнадцать";
            case 9 -> "девятнадцать";
            default -> "сколько-то";
        };
    }



    public static String getTen(int number) {
        return switch (number) {
            case 1 -> "десять";
            case 2 -> "двадцать";
            case 3 -> "тридцать";
            case 4 -> "сорок";
            case 5 -> "пятьдесят";
            case 6 -> "шестьдесят";
            case 7 -> "семьдесят";
            case 8 -> "восемьдесят";
            case 9 -> "девяносто";
            default -> "сколько-то";
        };
    }

    public static String getHundred(int number) {
        return switch (number) {
            case 1 -> "сто";
            case 2 -> "двести";
            case 3 -> "триста";
            case 4 -> "четыреста";
            case 5 -> "пятьсот";
            case 6 -> "шестьсот";
            case 7 -> "семьсот";
            case 8 -> "восемьсот";
            case 9 -> "девятьсот";
            default -> "сколько-то";
        };
    }

    public static String getOneThousand(int number) {
        return "тысяч";

    }

    //    public static String getCurrency() {
//
//    }
    public String rightCurrencyName(int lastDigit) {
        return switch (lastDigit) {
            case 1:
                yield "рубль";
            case 2, 3, 4:
                yield "рубля";
            default:
                yield "рублей";
        };
    }


}
