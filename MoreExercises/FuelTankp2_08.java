package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class FuelTankp2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBenzin = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;
        double discountBenzin = 0.18;
        double discountDiesel = 0.12;
        double discountGas = 0.08;

        String typeFuel = scanner.nextLine();
        double qntyFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();;

        double finalPrice = 0.0;

        if (clubCard.equals("Yes")) {
            if (typeFuel.equals("Diesel")) {
                finalPrice = (priceDiesel - discountDiesel) * qntyFuel;
            } else if (typeFuel.equals("Gas")) {
                finalPrice = (priceGas - discountGas) * qntyFuel;
            } else {
                finalPrice = (priceBenzin - discountBenzin) * qntyFuel;
            }
        } else {
            if (typeFuel.equals("Diesel")) {
                finalPrice = priceDiesel * qntyFuel;
            } else if (typeFuel.equals("Gas")) {
                finalPrice = priceGas * qntyFuel;
            } else {
                finalPrice = priceBenzin * qntyFuel;
            }
        }
        if (qntyFuel < 20) {
            finalPrice = finalPrice;
            System.out.printf("%.2f lv.", finalPrice);
        } else if (qntyFuel > 25) {
            finalPrice = finalPrice * 0.9;
            System.out.printf("%.2f lv.", finalPrice);
        } else {
            finalPrice = finalPrice * 0.92;
            System.out.printf("%.2f lv.", finalPrice);
            }
        }

    }