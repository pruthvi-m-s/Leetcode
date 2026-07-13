class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){reverse(0,n-1,nums);return;}
        for(int i=n-1;i>index;i--){
            if(nums[index]<nums[i]){
                swap(index,i,nums);
                break;
            }
        }
        reverse(index+1,n-1,nums);
    }
    public void reverse(int start, int end , int[] arr){
        while(start<end){
        swap(start,end,arr);
        start++;
        end--;
        }
    }
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}