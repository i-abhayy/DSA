# Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return  *an array*  `answer`  *such that*  `answer[i]`  *is equal to the product of all the elements of*  `nums`  *except*  `nums[i]`.

The product of any prefix or suffix of `nums` is  **guaranteed**  to fit in a  **32-bit**  integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

```

 **Example 2:** 

```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

```

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -30 <= nums[i] <= 30
- The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

 

 **Follow up:**  Can you solve the problem in `O(1)` extra space complexity? (The output array  **does not**  count as extra space for space complexity analysis.)

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 22.52%)  
**Memory:** 64.2 MB (beats 93.79%)  
**Submitted:** 2026-10-19T05:30:35.821Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)