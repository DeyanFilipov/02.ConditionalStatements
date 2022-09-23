package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0.0d;
        double taxiRate = 0.0d;

        if (dayOrNight.equals("day")) {
            taxiRate = 0.79;
        } else if (dayOrNight.equals("night")) {
            taxiRate = 0.90;
        }
        if (kilometers < 20) {
            price = 0.70 + (taxiRate * kilometers);
        } else if (kilometers < 100) {
            price = kilometers * 0.09;
        } else {
            price = kilometers * 0.06;
        }
        System.out.printf("%.2f", price);
        }
    }
