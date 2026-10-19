class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int[]abhay=new int[n];
       int[] prefix= new int[n];
       int[] suffix = new int [n];
       suffix[n-1]=nums[n-1];
       for(int i=n-2;i>=0;i--) suffix[i]=suffix[i+1]*nums[i];
       prefix[0]=nums[0];
       for(int i=1; i<n;i++)prefix[i]=prefix[i-1]*nums[i];

       for(int i=0;i<n;i++){
        int left=1,right=1;

        if(i>0) left=prefix[i-1];
        if(i<n-1) right=suffix[i+1];

        abhay[i]=left*right;
       }

        return abhay;
    }
}