import java.util.*;
public class productfun {
    public static int product(int num1,int num2){
        int pro=num1*num2;
        return pro;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        int product= product(a,b);
        System.out.println("Product of A and B:"+product);
    }
}
