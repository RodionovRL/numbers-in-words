package services;

import api.services.ConvertManager;
import api.services.Converter;
import api.services.Parser;
import numbers.FullNumber;
import api.services.LanguagePack;

public class ConvertManagerImpl implements ConvertManager {
    Converter converter;
    Parser parser;
    LanguagePack numbersName;

    public ConvertManagerImpl(Parser parser, Converter converter, LanguagePack numbersName) {
        this.converter = converter;
        this.parser = parser;
        this.numbersName = numbersName;
    }

    private FullNumber parseUserNumber(int userNumber) {
        return parser.parseInput(userNumber);
    }

    @Override
    public String addCurrencyToNumber(int userNumber) {
        return userNumber + " " + numbersName.rightCurrencyName(parseUserNumber(userNumber).getOnes());
    }

    @Override
    public String convertNumberToWords(int userNumber) {
        return converter.convertFullNumberInWords(parseUserNumber(userNumber));
    }


}
