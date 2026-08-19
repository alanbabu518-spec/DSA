class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = 0;

        for(int num:nums){
            current_sum+=num;
            max_sum = Math.max(current_sum,max_sum);

            if(current_sum<0){
                current_sum=0;
            }
        }
        return max_sum;
    }
}