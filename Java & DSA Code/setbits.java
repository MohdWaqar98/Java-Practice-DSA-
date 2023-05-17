public class setbits{
    public static void main(String args[]){
        int n=15,count=0,bitmask=1;
        while(n!=0){
            if((n&bitmask)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}