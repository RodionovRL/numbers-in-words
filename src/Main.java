import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutConsole output = new Output();

        Parser parser = new Parser();
        InputReader input = new ConsoleInputReader(scanner);
        Utils utils = new Utils();
        Modifier modifier = new Modifier(input, parser);

        output.print("Введите целое число рублей");
        int userNumber = input.scanUserInput();
        output.print(userNumber + " " + utils.rightCurrencyName(parser.lastDigitParse(userNumber)));
//        Digit digit =new Digit();
//        digit.setPosition(1);
//        digit.setValue(2);
//        System.out.println(digit.getInWords());
//        System.out.println(modifier.digitInWords(parser.parseInput(userNumber)));


    }
}
