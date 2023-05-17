import java.util.Arrays;
public class Sorting {
    public static void bubblesort(int array[]){
        for(int turn=0;turn<array.length-1;turn++){
            int swap=0;
            for(int j=0;j<=array.length-2-turn;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
            break;
            }
        }
    }
    public static void selectionsort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<array.length;j++){
            if(array[minpos]>array[j]){
                minpos=j;
            }
        }
        int temp=array[minpos];
        array[minpos]=array[i];
        array[i]=temp;
    }
    }
    public static void insertion(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;
        }
    }
    public static void countingsort(int array[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest,array[i]);
        }
        int countarray[]=new int[largest+1];
        for(int i=0;i<array.length;i++){
            countarray[array[i]]++;
        }
        int j=0;
        for(int i=0;i<countarray.length;i++){
            while(countarray[i]>0){
                array[j]=i;
                j++;
                countarray[i]--;
            }
        }
    }
    public static void printarr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        //insertion(array);
        countingsort(array);
        System.out.print("Array in sorted order:");
        printarr(array);

    }
}
