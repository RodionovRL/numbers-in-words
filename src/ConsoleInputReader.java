import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    Scanner scanner;

    public ConsoleInputReader(Scanner scanner) {
        this.scanner = scanner;
    }


    public int scanUserInput() {
        int inputUserAnswer = -10;
        if (scanner.hasNextInt()) {
            inputUserAnswer = scanner.nextInt();
        } else {
            System.out.print("Вы ввели что-то непотребное: ");
            System.out.println(scanner.nextLine());
        }
        return inputUserAnswer;
    }
}
