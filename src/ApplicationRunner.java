import inputOutput.ConsoleInputReader;
import inputOutput.InputReader;
import inputOutput.OutConsole;
import inputOutput.Output;
import utils.RussianNumbersName;
import utils.TextNumbersName;

public class ApplicationRunner {
    InputReader inputReader = new ConsoleInputReader();
    OutConsole outConsole = new Output();
    Parser parser = new ParserImpl();
    TextNumbersName numbersName = new RussianNumbersName();
    Converter converter = new ConverterImpl(numbersName);
    ConvertManager convertManager = new ConvertManagerImpl(parser, converter, numbersName);


    public void run() {
        int userInput = showPromptAndReadInput();
        outConsole.print(convertManager.addCurrencyToNumber(userInput));
        outConsole.print(convertManager.convertNumberToWords(userInput));
    }

    private int showPromptAndReadInput() {
        outConsole.print("Введите сумму от 1 до 2 147 483 647 (без пробелов)");
        int userInput = inputReader.scanUserInput();
        if (userInput < 1) {
            outConsole.print("Необходимо ввести целое положительное число!");
            return 0;
        }
        return userInput;
    }
}

