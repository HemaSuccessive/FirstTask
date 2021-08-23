//Find the best times to buy and sell a stock. You have an array for which the ith element is the price of a given stock on day "i". If you are only allowed to buy one share of the stock and sell one share of the stock, make a program to find the best times to buy and sell.


public class StockBuySellProgram {
 
    public static void main(String[] args) {
        int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
        System.out.println("profit :" + calculateMaxProfit(arr));
 
    }
 
    public static int calculateMaxProfit(int[] arr) {
        int lowprice = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowprice) {
                profit = arr[i] - lowprice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowprice = arr[i];
            }
        }
        return maxProfit;
    }
 
}
 ----------------------------------------------------------------
output
profit :87