public class buysellstock141 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int buy = prices[0];
        int profit =0;

        for(int i=1; i<prices.length;i++){
            if(!(buy < prices[i])){
                buy = prices[i];
                continue;
            }
            int sell = prices[i] - buy;

            if(sell>profit){
                profit = sell;
            }


        }
        System.out.println(profit);

    }
}
