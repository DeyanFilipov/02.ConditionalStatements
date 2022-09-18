package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillavsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetFilm = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double sumDecor = budgetFilm * 0.1;
        double allClothesPrice = statists * clothesPrice;
        if (statists > 150) {
            allClothesPrice = allClothesPrice - (0.1 * allClothesPrice);
        }
        double totalSum = allClothesPrice + sumDecor;
        if (totalSum > budgetFilm) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budgetFilm);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budgetFilm - totalSum);
        }

        }



    }
