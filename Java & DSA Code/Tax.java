import java.util.*;
public class Tax {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Income:");
        double i=sc.nextDouble();
        if(i<500000){
            double tax=0;
            System.out.println("Tax On Your Income:"+ tax);
        }
        else if(i>500000 && i<1000000){
            double tax= i*0.2;
            System.out.println("Tax On Your Income:"+ tax);
        }
        else{
            double tax= i*0.3;
            System.out.println("Tax On Your Income:"+ tax);
        }
    }
}
