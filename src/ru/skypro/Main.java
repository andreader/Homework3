package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        byte oneBananaWeight = 80;
        byte oneHundredMLMilkWeight = 105; float oneMLMilkWeight = oneHundredMLMilkWeight / 100;
        byte oneIceCreamWeight = 100;
        byte oneEggWeight = 70;

        int bananasWeight = bananas * oneBananaWeight;
        float milkWeight = oneMLMilkWeight * milk;
        int iceCreamWeight = iceCream * oneIceCreamWeight;
        int eggsWeight = eggs * oneEggWeight;

        float totalWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalKgWeight = totalWeight / 1000;
        System.out.println("The total weight of the healthy breakfast is " + totalKgWeight + " kg");
    }
}
