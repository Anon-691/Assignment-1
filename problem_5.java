import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage in Volts: ");
        double voltage = sc.nextDouble();

        System.out.print("Enter current in Amperes: ");
        double current = sc.nextDouble();

        double watts = voltage * current;
        System.out.println("Power Consumption = " + watts + " Watts");
    }
}
