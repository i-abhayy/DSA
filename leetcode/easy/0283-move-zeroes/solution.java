class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            nums[i]=temp;
            temp=nums[j];
            nums[i]=nums[j];
            j++;
        }
       
    }
}