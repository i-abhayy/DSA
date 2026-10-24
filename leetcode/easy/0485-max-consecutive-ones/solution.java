class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int max=0;
      int crnt=0;
      for( int i=0;i<nums.length;i++){
        if(nums[i]==1){
            crnt++;
            max=Math.max(max,crnt);
        }else{
            crnt=0;
        }
      }
        return max;
    }
}