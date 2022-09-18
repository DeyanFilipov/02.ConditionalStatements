package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double Swam1mSeconds = Double.parseDouble(scanner.nextLine());
        double result = distanceMeters * Swam1mSeconds;
        double slowDown = Math.floor(distanceMeters / 15) * 12.5;
        double finalResult = result + slowDown;
        if (record > finalResult) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - finalResult));
        }

    }
}
