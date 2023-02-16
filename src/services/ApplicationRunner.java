package services;

import api.services.*;
import inputOutput.ConsoleInputReader;
import inputOutput.Output;
import languagepack.RussianLanguagePack;

public class ApplicationRunner {
    InputReader inputReader = new ConsoleInputReader();
    OutConsole outConsole = new Output();
    Parser parser = new ParserImpl();
    LanguagePack languagePack = new RussianLanguagePack();
    Converter converter = new ConverterImpl(languagePack);
    ConvertManager convertManager = new ConvertManagerImpl(parser, converter, languagePack);


    public void run() {
        int userInput = showPromptAndReadInput();
        outConsole.print(convertManager.addCurrencyToNumber(userInput));
        outConsole.print(convertManager.convertNumberToWords(userInput));
    }

    private int showPromptAndReadInput() {
        outConsole.print(languagePack.askUserInput());
        int userInput = inputReader.scanUserInput(languagePack.getInputErrorMessage());
        if (userInput < 1) {
            outConsole.print(languagePack.getLessOneMessage());
            return 0;
        }
        return userInput;
    }
}

