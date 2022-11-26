public class BuySellStock {
    public static void main(String[] args) {
        int start = 0;
        int sum = 0;
        int[] prices = {3,3,5,0,0,3,1,4};
        while(start < prices.length-1){
            int minPrice = prices[start];
            int maxPrice = 0;
            for(int i=start; i<prices.length; i++){
            // minPrice = Math.min(prices[i], minPrice);
                if(prices[i] <= minPrice){
                    minPrice = prices[i];
                }
                if(prices[i]-minPrice > maxPrice){
                    maxPrice = prices[i]-minPrice;
                    start = i+1;
                }
            }
            sum = sum + maxPrice;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}