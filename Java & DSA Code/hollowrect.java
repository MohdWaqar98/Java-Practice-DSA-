import java.util.*;

public class hollowrect {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. Of Rows in Hollow Rectangle Pattern:");
        int row= sc.nextInt();
        System.out.print("Enter No. Of Columns in Hollow Rectangle Pattern:");
        int clm= sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=clm;j++){
                if(i==1||i==row||j==1||j==clm){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
