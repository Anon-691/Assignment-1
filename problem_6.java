import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first parallel side (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter length of second parallel side (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();

        double area = h * (a + b) / 2;
        System.out.println("Area of Trapezoid = " + area);
    }
}