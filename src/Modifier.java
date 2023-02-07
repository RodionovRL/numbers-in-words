import java.util.Scanner;

public class Modifier {
    Scanner scanner;
    ConsoleReading consoleReading;
    int inputDigits;
    public Modifier(Scanner scanner) {
        this.scanner = scanner;
        consoleReading = new Input();
    }
    public int lastDigitParser(int input) {
        if (input > 0) {
            return input % 10;
        }
        return 0;
    }
    public String rightCurrencyName() {
        return switch (lastDigitParser(inputDigits)) {
            case 1:
                yield "рубль";
            case 2, 3, 4:
                yield "рубля";
            default:
                yield "рублей";
        };
    }

    public int getInputDigits() {
        inputDigits = consoleReading.scanUserInput(scanner);
        return inputDigits;
    }
}
