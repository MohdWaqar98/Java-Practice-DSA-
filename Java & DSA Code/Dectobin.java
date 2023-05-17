import java.util.*;
public class Dectobin {
    public static int Dectobin(int n){
        int rem,bin=0,pow=0;
        while(n>0){
            rem=n%2;
            bin= bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Decimal Number:");
        int n = sc.nextInt();
        int bin = Dectobin(n);
        System.out.println("Binary Number:"+bin);
    }
}
