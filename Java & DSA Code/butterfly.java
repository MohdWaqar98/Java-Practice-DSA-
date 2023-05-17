import java.util.*;
public class butterfly {
    public static void butterfly(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(k=1;k<=(2*(n-i));k++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(k=1;k<=(2*(n-i));k++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Lines:");
        int n=sc.nextInt();
        butterfly(n);
    }
}
