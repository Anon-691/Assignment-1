/* 
     Question: print the series to n number of term, where n is the number of term enterd by the user.
     1,1,2,4,7,11,16,22,29,..........
*/

import java.util.Scanner;
public class NumberSequence {
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of terms:");
    int n=sc.nextInt();

    int diff=0;
    int res=1;
    for(int i=1;i<=n;i++){ 
     System.out.print(res + ",");
      res= res + diff;
      diff++;
    }
  }
}


/* 
     Question:   1,1,2,4,7,11,16,22,29,..........
                 Ask the user for the last term of the series. i.e if the user enters 25 the series should be
                 1,1,2,4,7,11,22.
*/                

import java.util.Scanner;
public class NumberSequence {
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter last term of the series:");
    int lt=sc.nextInt();

    int diff=0;
    int res=1;
    while(res<=lt){
       System.out.print(res + ",");
      res= res + diff;
      diff++;
    }
  }
}
