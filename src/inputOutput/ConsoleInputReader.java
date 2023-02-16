package inputOutput;

import api.services.InputReader;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    final Scanner scanner;

    public ConsoleInputReader() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public int scanUserInput(String errorMessage) {
        int inputUserAnswer;
        if (scanner.hasNextInt()) {
            inputUserAnswer = scanner.nextInt();
        } else {
            System.out.print(errorMessage + " :");
            System.out.println(scanner.nextLine());
            return 0;
        }
        return inputUserAnswer;
    }


}
