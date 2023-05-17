import java.util.*;
public class Reverse {
    public static void main(String args[]){
        int n,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No You Want To Reverse:");
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse Of A No:"+rev);
    }
}
