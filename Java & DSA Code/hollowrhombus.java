import java.util.*;
public class hollowrhombus {
    public static void hrhom(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(k=1;k<=n;k++){
                    if(i==1||i==n||k==1||k==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter No Of Lines:");
            int n=sc.nextInt();
            hrhom(n);
        } 
    }

