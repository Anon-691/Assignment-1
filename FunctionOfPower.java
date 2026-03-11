import java.util.Scanner;
public class FunctionOfPower {
  public static int power(int a , int b){
    int c=1;
    for(int i=1;i<=b;i++){
      c*=a;
    }
    return(c);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    System.out.println("Enter power:");
    int b=sc.nextInt();
    
    int res;
    res=power(a,b);
    System.out.println(res);
  }
}
