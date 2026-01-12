import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter discounted selling price: ");
        double discountedPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount_percent = sc.nextDouble();

        double original_SellingPrice = discountedPrice / (1 - discount_percent / 100);
        System.out.println("Original Selling Price = " + original_SellingPrice);
    }
}
