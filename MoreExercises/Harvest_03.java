package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double harvest = (X * 0.40) * Y;
        double wine = harvest / 2.5;
        double litersLeft = Math.abs(wine - Z);
        double litersPerWorker = litersLeft / workers;

        if (wine < Z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersLeft));
        }
        else if (wine >= Z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%s liters left -> %s liters per person.", (int)Math.ceil(litersLeft),(int)Math.ceil(litersPerWorker));
        }
    }
}
