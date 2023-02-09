public class Modifier {
    InputReader inputReader;
    Parser parser;

    public Modifier(InputReader input, Parser parser) {
        inputReader = input;
        this.parser = parser;
    }

//    public String modifyNumbersInWords(Number number){
//        String result;
//        for (int i = number.numOfDigits(); i > 0; i--) {
//            Digit digit = number.getDigit(i);
//            switch (digit.)
//            result += Utils.getOne()
//        }
//    }

    public String digitInWords(Number number) {
        StringBuilder result = new StringBuilder();
        for (int i = number.numOfDigits() - 1; i > 0; i--) {
            Digit digit = number.getDigit(i);
            switch (digit.getPosition()) {
                case 1 -> result.append(Utils.getOne(digit.getValue()));
                case 2 -> {
                    if (digit.getValue() == 1) {
                        result.append(Utils.getElevenNineteen(number.getDigit(i - 1).getValue()));
                        break;
                    }
                    result.append(Utils.getTen(digit.getValue()));
                }
                case 3 -> result.append(Utils.getHundred(digit.getValue()));
            }

        }

        return result.toString();
    }
}