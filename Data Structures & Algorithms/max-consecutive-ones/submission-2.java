class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int currentsum=0,maxsum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                currentsum++;
            }
            else{
                maxsum=Math.max(maxsum,currentsum);
                currentsum=0;
            }
        }return Math.max(maxsum,currentsum);
    }
}