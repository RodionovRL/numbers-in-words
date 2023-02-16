package inputOutput;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    final Scanner scanner;

    public ConsoleInputReader() {
        this.scanner = new Scanner(System.in);
    }


    public int scanUserInput() {
        int inputUserAnswer;
        if (scanner.hasNextInt()) {
            inputUserAnswer = scanner.nextInt();
        } else {
            System.out.print("Вы ввели что-то непотребное: ");
            System.out.println(scanner.nextLine());
            return 0;
        }
        return inputUserAnswer;
    }


}
