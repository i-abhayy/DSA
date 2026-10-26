# Merge Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

 **Examples:** 

```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: We get the sorted array after using merge sort

```

```
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: We get the sorted array after using merge sort 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T05:24:43.619Z  

```java
class Solution {
    public void conquer(int arr[],int l,int mid,int r){
        int[] abhay=new int [r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        
        while(i<=mid&&j<=r){
            if(arr[i]<arr[j]) abhay[k]=arr[i++];
            else abhay[k]=arr[j++];
            k++;
        }
        while(i<= mid) abhay[k++]=arr[i++];
        while(j<=r) abhay[k++]=arr[j++];
        
        for(int x=0;x<abhay.length;x++){
            arr[l+x]=abhay[x];
        }
    }
    public void mergeSort(int arr[], int l, int r) {
       if(l>=r) return;
       int mid =(l+r)/2;
       mergeSort(arr,l,mid);
       mergeSort(arr,mid+1,r);
       conquer(arr,l,mid,r);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-sort/1)