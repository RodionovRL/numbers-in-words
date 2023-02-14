import inputOutput.ConsoleInputReader;
import inputOutput.InputReader;
import inputOutput.OutConsole;
import inputOutput.Output;
import numbers.Digit;
import numbers.FullNumber;
import utils.Utils;

public class Main {
    public static void main(String[] args) {

        OutConsole output = new Output();

        Parser parser = new Parser();
        InputReader input = new ConsoleInputReader();
        Converter converter = new Converter();

        output.print("Введите целое число рублей");
        int userNumber = input.scanUserInput();
        FullNumber parsedFullNumber = parser.parseInput(userNumber);
        output.print(userNumber + " " + Utils.rightCurrencyName(parsedFullNumber.getOnes()));
        System.out.println(converter.convertFullNumberInWords(parsedFullNumber));
    }


}
