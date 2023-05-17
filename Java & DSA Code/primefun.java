import java.util.*;
public class primefun {
    public static int prime(int n){
    int i,count=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number You want to check:");
        int n=sc.nextInt();
        int ct= prime(n);
        if(ct==1){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Composite");
        }
    }

}
