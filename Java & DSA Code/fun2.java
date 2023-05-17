import java.util.*;
public class fun2 {
    public static void sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum Of A and B:"+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        sum(a,b);
    }
}
