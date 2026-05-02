import java.util.Scanner;
public class PopulationCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter populations");
        int pop=sc.nextInt();
        int[] population=new int[300];
        int tpop=0;
        int count=0;
        int i=0;
     
        while(pop>=0){
        
            population[i]=pop;
            tpop+=pop;
            i++;
            count++;
            
            pop=sc.nextInt();
        }
         if (count > 0) {
            double avgpop = 1.0 * tpop / count;
            System.out.println("Populations are:");
            for (int j = 0; j < i; j++) {
                System.out.println(population[j]);
            }

            System.out.println("Average is:\n"+avgpop);
        } else {
            System.out.println("No valid input");
        }
    }
}
