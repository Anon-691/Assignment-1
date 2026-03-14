import java.util.Scanner;
public class PopulationCalculator{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number of populations :");
int n=sc.nextInt();
int[] arr = new int[n];
int i=0; 
int totPop=0;

System.out.println("Enter populations :");
while(true){
int num=sc.nextInt();

if(num<0){
 break;
}
arr[i]=num;
i++;
totPop+=num;
}

System.out.println("Your populations are:");
for(int j=0;j<i;j++){
    System.out.println(arr[j]);
}

System.out.println("Total population =" + totPop);
double avg=(totPop)/i;

if(i > 0){
            System.out.println("Population Average = " + avg );
            
}
  }
}
