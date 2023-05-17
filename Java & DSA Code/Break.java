import java.util.*;
public class Break {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter Your Number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
