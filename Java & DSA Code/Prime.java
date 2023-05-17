import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        System.out.print("Enter The Number:");
        n=sc.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Composite");
        }
    }
}
