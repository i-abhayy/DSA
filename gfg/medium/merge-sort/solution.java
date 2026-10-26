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