package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Homework 3.5");

        int wageMasha = 67760;
        int wageDenis = 83690;
        int wageKris = 76230;

        int wageMasha10PercentMore = wageMasha + wageMasha/10;
        int wageDenis10PercentMore = wageDenis + wageDenis/10;
        int wageKris10PercentMore = wageKris + wageKris/10;

        int wageMashaYear = wageMasha * 12;
        int wageDenisYear = wageDenis * 12;
        int wageKrisYear = wageKris * 12;

        int wageMasha10PercentMoreYear = wageMasha10PercentMore * 12;
        int wageDenis10PercentMoreYear = wageDenis10PercentMore * 12;
        int wageKris10PercentMoreYear = wageKris10PercentMore * 12;

        int differenceWageMasha = wageMasha10PercentMoreYear - wageMashaYear;
        int differenceWageDenis = wageDenis10PercentMoreYear - wageDenisYear;
        int differenceWageKris = wageKris10PercentMoreYear - wageKrisYear;

        System.out.println("Now Masha gets " + wageMasha10PercentMore + " rub. " +
                "Annual income increased by " + differenceWageMasha + " rub.");
        System.out.println("Now Denis gets " + wageDenis10PercentMore + " rub. " +
                "Annual income increased by " + differenceWageDenis + " rub.");
        System.out.println("Now Kristina gets " + wageKris10PercentMore + " rub. " +
                "Annual income increased by " + differenceWageKris + " rub.");
    }
}
