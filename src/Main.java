import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintInConsole output = new Output();
        Modifier modifier = new Modifier(scanner);

        output.printInConsole("Введите целое число рублей");
        output.printInConsole(modifier.getInputDigits() + " " + modifier.rightCurrencyName());

    }
}
