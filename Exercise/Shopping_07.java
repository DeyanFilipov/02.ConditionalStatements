package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int priceVideoCard = 250;
        double priceVideoCards = videoCards * priceVideoCard;
        double priceProcessor = 0.35 * priceVideoCards;
        double priceProcessors = processors * priceProcessor;
        double priceRam = 0.10 * priceVideoCards;
        double priceRAM = ram * priceRam;
        double totalPrice = priceVideoCards + priceProcessors + priceRAM;
        double totalPriceDiscount = totalPrice;
        if (videoCards > processors) {
            double discount = 0.15;
            totalPriceDiscount = totalPrice - (totalPrice * discount);
        }
        double budgetLeft = budget - totalPriceDiscount;

        if (budgetLeft >= 0) {
            System.out.printf("You have %.2f leva left!", budgetLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budgetLeft));

        }
    }
}
