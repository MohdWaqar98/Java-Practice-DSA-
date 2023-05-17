import java.util.*;
public class invert {
    public static void invert(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            for(k=1;k<i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Lines:");
        int n=sc.nextInt();
        invert(n);
    }
}
