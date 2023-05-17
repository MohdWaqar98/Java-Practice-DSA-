import java.util.*;
public class floyd {
    public static void floyd(int n){
        int i,j,k;
        k=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Lines:");
        int n=sc.nextInt();
        floyd(n);
    }
}
