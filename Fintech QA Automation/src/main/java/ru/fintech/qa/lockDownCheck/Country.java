package ru.fintech.qa.lockDownCheck;

public enum Country {
    AUSTRIA("Австрия", true),
    BELGIUM("Бельгия", false),
    BULGARIA("Болгария", true),
    CROATIA("Хорватия", false),
    CYPRUS("Кипр", true),
    CZECHIA("Чехия", false),
    DENMARK("Дания", true),
    ESTONIA("Эстония", false),
    FINLAND("Финляндия", true),
    FRANCE("Франция", false),
    GERMANY("Германия", true),
    GREECE("Греция", false),
    HUNGARY("Венгрия", true),
    IRELAND("Ирландия", false),
    ITALY("Италия", true),
    LATVIA("Латвия", false),
    LITHUANIA("Литва", true),
    LUXEMBOURG("Люксембург", false),
    MALTA("Мальта", true),
    NETHERLANDS("Нидерланды", false),
    POLAND("Польша", true),
    PORTUGAL("Португалия", false),
    ROMANIA("Румыния", true),
    SLOVAKIA("Словакия", false),
    SLOVENIA("Словения", true),
    SPAIN("Испания", false),
    SWEDEN("Швеция", true);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return  name() + " (" + ruName + ")";
    }

    public boolean check() {
       return isOpen;
    }

    public static Country getByRuName(final String input) throws NoSuchCountryException {
        Country result = null;

            for (Country c : Country.values()) {
                if (c.ruName.equals(input)) {
                    result = c;
                }
            }
        if (result == null) {
            throw new NoSuchCountryException(input);
        }
        return result;
    }



}
