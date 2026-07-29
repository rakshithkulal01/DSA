class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        int mp=Integer.MAX_VALUE;
        for(int price : prices){
            if(price<mp){
                mp=price;
            }else{
                prof=Math.max(prof,price-mp);
            }

        }
        return prof;
    }
}