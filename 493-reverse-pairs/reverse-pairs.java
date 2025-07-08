class Solution {
    public static void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[k++]=arr[left];
                left++;
            }
            else{
                temp[k++]=arr[right];
                right++;
            }
        }
        while(left<=mid){
            temp[k++]=arr[left];
            left++;
        }
        while(right<=high){
            temp[k++]=arr[right];
            right++;
        }
        for(k=0;k<temp.length;k++){
            arr[low+k]=(int)temp[k];
        }
    }
    public static int countPairs(int arr[],int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i] > 2L * (long)arr[right]){
                right++;
            }
            count+=right-(mid+1);
        }
        return count;
    }
    public static int mergeSort(int arr[],int low,int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int count=0;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    } 

    public static int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
        
    }
}