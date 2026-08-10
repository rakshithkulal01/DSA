class Solution {
    public int searchInsert(int[] nums, int t) {
        int right=nums.length-1;
        int left=0;
        while(left<=right){
           int  mid=left+(right-left)/2;
           if(t==nums[mid]){
            return mid;
           }else if( t<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }

           }
        return left;
        }
        
    }
