import java.util.*;
public class SumN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,n;
        System.out.print("Enter N You Want To Sum:");
        n=sc.nextInt();
        while(n>0){
            sum=sum+n;
            n--;
        }
        System.out.println("Sum Of N Natural Number:"+sum);
    }
}
