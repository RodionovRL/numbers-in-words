import inputOutput.ConsoleInputReader;
import inputOutput.InputReader;
import inputOutput.OutConsole;
import inputOutput.Output;
import numbers.Digit;
import numbers.FullNumber;
import utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OutConsole output = new Output();

        Parser parser = new Parser();
        InputReader input = new ConsoleInputReader(scanner);
        Converter converter = new Converter();

        output.print("Введите целое число рублей");
        int userNumber = input.scanUserInput();
        FullNumber parsedFullNumber = parser.parseInput(userNumber);
        output.print(userNumber + " " + Utils.rightCurrencyName(parsedFullNumber.getOnes()));

        Digit digit;
        digit = new Digit();
        digit.setPosition(1);
        digit.setValue(2);

        System.out.println(converter.convertFullNumberInWords(parsedFullNumber));


    }


}
