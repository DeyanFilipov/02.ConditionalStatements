package ConditionalStatements.Lab;

import java.util.Scanner;
public class AreaofFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        }else if (shape.equals("rectangle")) {
            double a  = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;

        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = 0.5 * a * h;
        }
        System.out.printf("%.3f", area);
    }
}