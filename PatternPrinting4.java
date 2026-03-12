/* Question: Write a Java program that takes a number n from the user and prints the below diagram in the same pattern

*  *  *  *  *
*  *  *  *
*  *  *
*  *
*
  */

import java.util.Scanner;
public class PatternPrinting4{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
   for(int i=1;i<=n;i++){
     for(int j=n;j>=i;j--){
       System.out.print(" * ");
     }
     System.out.println( );
   }
    
  }
}
