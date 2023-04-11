package generalProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StockProgram {
    public static void main(String[] args) {
        int[] price={1,2,3,4,5};
        maxProfit(price);
        //System.out.println(maxProfit1(price)+"proce");
    }

    public static int maxProfit(int[] prices){
        List<Integer> buyDays=new ArrayList<>();
        List<Integer> sellDays= new ArrayList<>();
         for(int i=1; i<prices.length;i++){
             if(prices[i-1]<prices[i] && i>returnValue(sellDays)){
                 buyDays.add(i-1);
             }
             else if(prices[i-1]>prices[i] && i>1){
                 sellDays.add(i-1);
             }
         }

         int profit=0;
         int iteration=Math.min(buyDays.size(),sellDays.size());
         for(int j=0;j<iteration;j++){
             if(buyDays.get(j)<sellDays.get(j)){
                 profit=profit+(prices[sellDays.get(j)]-prices[buyDays.get(j)]);
                 System.out.println(profit+"loop");
             }
         }

         System.out.println(profit);
        System.out.println(buyDays);
        System.out.println(sellDays);
        System.out.println(iteration);
         return profit;


    }

    public static int returnValue(List<Integer> s){
        Iterator<Integer> itr=s.listIterator();
        if(itr.hasNext()){
            return itr.next();
        }
        return 0;
    }
    static int maxProfit1(int[] prices)
    {
        int[] price={7,1,4,5,3,6,1};
        if (prices.length < 2)
            return 0;
        int sellingDate = 0;
        int buyingDate = 0;
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= prices[i - 1]){
                sellingDate++;}
            else {
                totalProfit=totalProfit+ (prices[sellingDate]
                        - prices[buyingDate]);
                sellingDate = buyingDate = i;
            }
        }
        totalProfit
                = totalProfit+ (prices[sellingDate] - prices[buyingDate]);
        return totalProfit;
    }
}
