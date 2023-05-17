import java.util.*;
public class Binarysearch {
    public static int Binarysearch(int array[],int key){
        int mid,start=0,end=array.length-1;
        for(int i=start;i<=end;i++){
            mid=(start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]>key){
                end=mid-1;
            }
            if(array[mid]<key){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]={2,4,6,8,10,12,14,19,46,72,74,89};
        System.out.print("Enter the element You want to find:");
        int key=sc.nextInt();
        int search=Binarysearch(array, key);
        if(search==-1){
            System.out.println(key+" is not found in the array!  :)");
        }
        else{
            System.out.println(key+" is found at index "+search);
        }
    }
}
