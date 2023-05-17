import java.util.*;
public class Linearsearch {
    public static int Linearsearch(int array[],int key)
    {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int array[]={2,4,5,9,8,7,6,10,12,144,41};
        int key=98;
        int index = Linearsearch(array, key);
        if(index==-1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key is at Index:"+index);
        }
    }
}
