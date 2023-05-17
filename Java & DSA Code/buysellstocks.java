public class buysellstocks {
    public static void stocks(int prices[]){
        int max=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            int sell=prices[i];
            int profit=sell-buy;
            if(profit<0){
                buy=prices[i];
            }
            max=Math.max(max,profit);
        }
        System.out.println("Maximum profit of stock are:"+max);
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        stocks(prices);
    }
}
