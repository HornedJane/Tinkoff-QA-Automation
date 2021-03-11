package ru.fintech.qa.lockDownCheck;

public class NoSuchCountryException extends Exception {
    public NoSuchCountryException(final String inputCountry) {
        super("Страны '" + inputCountry + "' не существует");
    }
}
