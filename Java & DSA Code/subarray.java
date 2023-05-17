public class subarray {
    public static void subarray(int array[]){
        int minsubarray=Integer.MAX_VALUE;
        int maxsubarray=Integer.MIN_VALUE;
        int prefixarray[]= new int[array.length];
        prefixarray[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixarray[i]=prefixarray[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum = i==0? prefixarray[j] : prefixarray[j]-prefixarray[i-1];
                    if(sum>maxsubarray){
                        maxsubarray=sum;
                    }
                    if(sum<minsubarray){
                        minsubarray=sum;
                    }
                }
            }
            System.out.println("Sum of Minimum Subarray:"+minsubarray);
            System.out.println("Sum Of Maximum Subarray:"+maxsubarray);
    }
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        subarray(array);
        }
}
