public class Buy_and_Sell_Stock {
    // public static int isBuy_and_Sell_Stock(int price[])
    // {
    //     int buyingprice=Integer.MAX_VALUE;
    //     int maxprofit=0;
    //     for(int i=0;i<price.length;i++)
    //     {
    //         if(buyingprice<price[i])
    //         {
    //             int profit=price[i]-buyingprice;
    //             maxprofit=Math.max(maxprofit,profit);     
    //         }else{
    //             buyingprice=price[i];
    //         }
    //     }
    //     return maxprofit;
    // }

    public static int isBuy_and_Sell_Stock(int price[])
    {
        int maxprofit=0;
        int buyingprice = Integer.MAX_VALUE;

        for (int i=0;i<price.length;i++)
        {
            if(buyingprice<price[i])
            {
                int profit = price[i]-buyingprice;

                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyingprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.err.println("max profit is = "+isBuy_and_Sell_Stock(price));
    }
}
