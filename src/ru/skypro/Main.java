package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Homework 3.4");

        byte loseWeight = 7;
        float loseWeightDayMin = 0.25F;
        float loseWeightDayMax = 0.5F;

        float daysMin = loseWeight / loseWeightDayMin;
        float daysMax = loseWeight / loseWeightDayMax;

        float daysSummary = daysMax + daysMin;

        float daysAverage = daysSummary / 2;
        float remainderOfDivisionDaysAverage = daysAverage % loseWeight;
        System.out.println(remainderOfDivisionDaysAverage);
        System.out.println("It's necessary " + daysAverage + " days in average to loose 7 kg!");

    }
}
