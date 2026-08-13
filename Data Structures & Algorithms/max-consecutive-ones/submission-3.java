class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int currentsum=0,maxsum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               maxsum=Math.max(maxsum,currentsum);
                currentsum=0; 
            }
            else{
                currentsum++;
            }
        }return Math.max(maxsum,currentsum);
    }
}