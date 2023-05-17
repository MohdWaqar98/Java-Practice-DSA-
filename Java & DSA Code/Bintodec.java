import java.util.*;
public class Bintodec {
    public static int Bintodec(int n){
        int pow=0,dec=0;
        while(n>0){
            int ld=n%10;
            dec=dec+(ld * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Binary Number:");
        int n = sc.nextInt();
        int dec = Bintodec(n);
        System.out.println("Decimal Number:"+dec);
    }
}
