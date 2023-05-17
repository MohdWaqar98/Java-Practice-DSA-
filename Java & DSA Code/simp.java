import java.util.*;
public class simp {
    public static void Decreasingrec(int n){
        if(n==1){
            System.out.print(n);
        }
        else{
            System.out.print(n+" ");
            Decreasingrec(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        System.out.print("Decreasing Number are: ");
        Decreasingrec(n);
        
    }
}