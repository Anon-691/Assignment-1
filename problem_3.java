import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original selling price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount_percent  = sc.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discount_percent / 100);
        System.out.println("Discounted Selling Price = " + discountedPrice);
    }
}