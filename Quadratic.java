import java.util.Scanner;

public class Quadratic {

    static void calculateRoots(double a, double b, double c) {

        double D = (b * b) - (4 * a * c);

        System.out.printf("Discriminant = %.2f\n", D);

        if (D > 0) {

            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Nature of roots: Real and Distinct");
            System.out.printf("Root 1 = %.2f\n", root1);
            System.out.printf("Root 2 = %.2f\n", root2);

        } else if (D == 0) {

            double root = -b / (2 * a);

            System.out.println("Nature of roots: Real and Equal");
            System.out.printf("Root 1 = Root 2 = %.2f\n", root);

        } else {

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-D) / (2 * a);

            System.out.println("Nature of roots: Complex");
            System.out.printf("Root 1 = %.2f + %.2fi\n", real, imaginary);
            System.out.printf("Root 2 = %.2f - %.2fi\n", real, imaginary);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a,b,c: ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        calculateRoots(a, b, c);

        sc.close();
    }
}