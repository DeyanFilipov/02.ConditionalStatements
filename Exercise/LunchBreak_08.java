package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filmName = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());
        int breakTime= Integer.parseInt(scanner.nextLine());
        double lunchBreak = breakTime / 8.0;
        double relaxTime = breakTime / 4.0;
        double freeTime = breakTime - lunchBreak - relaxTime;

        if (freeTime >= movieTime) {
            double timeLeft = Math.ceil(freeTime - movieTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, timeLeft);
        } else {
            double needTime = Math.ceil(movieTime - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName, needTime);
        }


    }
}
