class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        double max=0;
        double avg=0;
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        max=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum+=nums[i];
            windowsum-=nums[i-k];
            max=Math.max(max,windowsum);
        }
        avg=max/k;
        return avg;
    }
}