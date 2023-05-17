import java.util.*;
public class Large3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
        System.out.print("Enter C:");
        c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Largest is "+a);
        }
        else if(b>=c){
            System.out.println("Largest is "+b);
        }
        else{
            System.out.println("Largest is "+c);
        }
    }
}
