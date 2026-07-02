class Solution {
    public int maxProduct(int[] nums) {
        int i=1;
        int j=1;
        int max=0;
        int n=nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
    for(int k=0;k<nums.length;k++){
        if(i==0){
            i=1;
        }
        if(j==0){
            j=1;
        }

        i=nums[k]*i;
        j=nums[n-k]*j;
        max=Math.max((Math.max(i,j)),max);
       
    




    }
    return max;

        
    }
}