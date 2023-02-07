import java.util.Scanner;

public class Input implements ConsoleReading{
    public int scanUserInput(Scanner scanner) {
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
