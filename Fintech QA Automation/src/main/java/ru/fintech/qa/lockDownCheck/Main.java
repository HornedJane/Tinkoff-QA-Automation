package ru.fintech.qa.lockDownCheck;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        String inputCountry;
        Country country = null;

        printCountries();
        inputCountry = getNewCountry();
        try {
            country = Country.valueOf(inputCountry);
        } catch (NullPointerException e) {
            System.out.println("Наименование страны не было введено");
        } catch (IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно,\n"
                    + " проверяем русское название...");
            try {
                country = Country.getByRuName(inputCountry);
            } catch (NoSuchCountryException exception) {
                System.out.println(exception.getMessage());
            }
        }
        if (country != null) {
            if (country.check()) {
                System.out.println("Страна [" + country + "] открыта для посещения");
            } else {
                System.out.println("Страна [" + country + "] закрыта для посещения");
            }
        }
    }

    public static String getNewCountry() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите страну");
        return in.nextLine().replace(" ", "").toUpperCase();
    }

    public static void printCountries() {
        for (Country c : Country.values()) {
            System.out.println(c.toString());
        }
    }
}


