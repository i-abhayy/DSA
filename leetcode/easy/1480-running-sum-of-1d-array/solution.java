class Solution {
    public int[] runningSum(int[] nums) {
        int[] Abhay= new int[nums.length];
        Abhay[0]=nums[0];
        for(int i=1; i<nums.length;i++){
        Abhay[i]=Abhay[i-1]+ nums[i];

        }
        return Abhay;
    }
}