package arrays;

public class StockPrice {
    public static int maxProfit(int prices[]){
        int buyprice= Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<prices.length;i++){
            if( buyprice<prices[i]){
                int profit= prices[i]-buyprice;
                max=Math.max(profit,max);
            }else{
                      buyprice=prices[i];
                }

        }
        return max;

    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       int Finalprofit= maxProfit(prices);
        System.out.println("maximus profit is"+Finalprofit);
    }
}
