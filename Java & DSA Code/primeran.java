import java.util.*;
public class primeran {
    public static int prime(int n){
        int i,count=0;
            for(i=1;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            return count;
        }
    public static void primerange(int n){
        for(int i=2;i<n;i++){
            int s= prime(i);
            if(s==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        primerange(n);
    }
}
