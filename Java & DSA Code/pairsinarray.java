public class pairsinarray {
    public static void pairs(int array[]){
        System.out.println("Pairs are:");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.println("("+array[i]+","+array[j]+")");
            }
        }
    }
    public static void main(String args[]){
    int array[]={2,4,6,8,45};
    pairs(array);
    }
}
