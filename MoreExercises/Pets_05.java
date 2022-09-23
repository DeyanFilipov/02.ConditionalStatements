package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogFoodDay = Double.parseDouble(scanner.nextLine());
        double catFoodDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodDay = Double.parseDouble(scanner.nextLine());
        double neededFoodDog = days * dogFoodDay;
        double neededFoodCat = days * catFoodDay;
        double neededFoodTurtle = (days * turtleFoodDay) / 1000;
        double food = (Math.ceil(neededFoodDog + neededFoodCat + neededFoodTurtle));
        double leftOverFood = (Math.abs(foodLeft - food));
        if (food <= foodLeft) {
            System.out.printf("%.0f kilos of food left.", leftOverFood);
        } else if (food > foodLeft) {
            System.out.printf("%.0f more kilos of food are needed.", leftOverFood) ;
        }
    }
}
