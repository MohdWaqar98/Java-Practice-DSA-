import java.util.Scanner;

public class trappedrainwater {
    public static void trappedrainwater(int height[],int width){
        //Left max boundary
        int leftmax[]= new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        //Right max boundary
        int rightmax[]= new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        //Trapped rainwater with loop
        int tp=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            tp=tp+((waterlevel-height[i])*width);
        }
        System.out.print("Total Trapped Rainwater:"+tp);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of Bars you want in array:");
        int n=sc.nextInt();
        int height[]= new int[n];
        System.out.println("Enter Height Of each Bar(non negative integers):");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.print("Enter the width of the bar:");
        int width=sc.nextInt();
        trappedrainwater(height,width);
    }
}
