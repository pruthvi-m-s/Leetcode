class Solution {
    public int maxSubArray(int[] nums) {
        int curSum=nums[0];
        int maxP=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curSum<0){
                curSum=nums[i];
            }
            else{
                curSum+=nums[i];
            }
            maxP=Math.max(curSum,maxP);
        }
        return maxP;
    }
}