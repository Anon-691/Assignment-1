import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double OM = sc.nextDouble();

        System.out.print("Enter maximum marks: ");
        double MM = sc.nextDouble();

        double Percentage = (OM / MM) * 100;
        System.out.println("Percentage = " + Percentage + "%");
        
    }
}

