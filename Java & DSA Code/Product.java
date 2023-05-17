import java.util.*;
public class Product {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Product Of A and B:");
        int product = a*b;
        System.out.print(product);
    }
}
