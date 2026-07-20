class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;

        while(high<n){
           sum+= nums[high]; 

           while(sum>=target){
            int leng=high-low+1;
            l=Math.min(l,leng);
            sum-= nums[low];
            low++;
           }
           high++;
        }
        return l==Integer.MAX_VALUE? 0:l;
           
        
    }
}