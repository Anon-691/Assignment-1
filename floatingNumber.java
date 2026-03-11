import java.util.Scanner;

public class floatingNumber {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a floating point number:");
    String num = sc.nextLine();
    
    String[] fn = num.split("\\.");
    
    System.out.println("Numbers before decimal are: " + fn[0]);
    System.out.println("Numbers after decimal are: " + fn[1]);

  }
}
