import java.util.*;
public class Increasingrec {
    public static void Increasingrec(int n){
        if(n==1){
            System.out.print(n+" ");
        }
        else{
        Increasingrec(n-1);
        System.out.print(n+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        System.out.print("Increasing Number are: ");
        Increasingrec(n);
        
    }
}

