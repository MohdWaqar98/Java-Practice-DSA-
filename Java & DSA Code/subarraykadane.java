import java.util.Scanner;

public class subarraykadane {
    public static void subarraykadane(int array[]){
        int maxs=Integer.MIN_VALUE;
        int mins=Integer.MAX_VALUE;
        int cs=0;
        int m=0;
        for(int i=0;i<array.length;i++){
            cs=cs+array[i];
            m=m+cs;
            if(cs<0){
                cs=0;
            }
            maxs=Math.max(cs, maxs);
            mins=Math.min(m, mins);
        }
        System.out.println("Sum of Minimum Subarray:"+mins);
        if(maxs==0){
            int mk=Integer.MIN_VALUE;
            for(int i=0;i<array.length;i++){
                mk=Math.max(mk,array[i]);
            }
            System.out.println("Sum of Maximum Subarray:"+mk);
        }
        else{
        System.out.println("Sum Of Maximum Subarray:"+maxs);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements you want in array:");
        int n=sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        subarraykadane(array);
    }
}
