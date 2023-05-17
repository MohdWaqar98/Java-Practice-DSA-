import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Enter The Lines You Want In Pattern:");
        int n=sc.nextInt();
        //StarPattern
        System.out.println("Star Pattern");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //InvertedStarPattern
        System.out.println("Inverted Star Pattern");
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //HalfPyramidPattern
        System.out.println("Half Pyramid Pattern");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Character Pattern
        System.out.println("Character Pattern");
        char c='A';
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
