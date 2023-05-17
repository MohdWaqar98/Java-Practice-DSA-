import java.util.*;
public class binocof {
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static int binocoef(int n,int r){
        int a,b,c,d,e;
        a = fact(n);
        b = fact(r);
        d=n-r;
        c = fact(d);
        e = a/(b*c);
        return e;
    }
    public static void main(String args[]){
        int n,r,bc;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        n=sc.nextInt();
        System.out.print("Enter R:");
        r=sc.nextInt();
        bc = binocoef(n,r);
        System.out.println("Binomial Coefficient:"+bc);
    }
}
