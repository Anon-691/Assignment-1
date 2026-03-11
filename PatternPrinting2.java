/*Question: print
* 
* * 
* * * 
* * * *  
* * * * * (for n number of stars or wanted by user in this same pattern)
  */
import java.util.Scanner;                  
public class PatternPrinting2 {
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   int number=sc.nextInt();
   
  for(int i=1;i<=number;i++){
    for(int j=1;j<=i;j++){
  System.out.print("* ");
    }
    System.out.println( );
  }
}
}
