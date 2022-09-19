package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int p1= Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double sum = (p1 + p2) * H;
        double diff = V - sum;

        if (diff >= 0) {
            double filledV = (V - diff) / (double)V * 100.0;
            double p1Percent = p1 / (double) (p1 +p2) * 100.0;
            double p2Percent = p2 / (double) (p1 +p2) * 100.0;
            System.out.println("The pool is " + filledV + "% full. Pipe 1: " + p1Percent + "%. Pipe 2: " + p2Percent +"%.");
        }
        else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, Math.abs(diff));
        }
    }
}