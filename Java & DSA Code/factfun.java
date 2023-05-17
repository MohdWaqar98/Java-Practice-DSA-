import java.util.*;
public class factfun {
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number You want to find factorial:");
        int num=sc.nextInt();
        int fact = fact(num);
        System.out.println("Factorial :"+fact);
    }
}
