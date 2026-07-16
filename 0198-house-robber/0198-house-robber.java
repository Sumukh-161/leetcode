class Solution {
    public int rob(int[] nums) {
        //int[] dp = new int[nums.length];
        if(nums.length == 1) return nums[0];
        int prv1 = nums[0] ;
        int prv2 = 0;
        int curr = 0;
        for( int i = 1 ; i<= nums.length-1 ; i++){
            int take = nums[i] + prv2;
            int nontake = 0 + prv1;
            curr = Math.max(take,nontake);
            prv2 = prv1;
            prv1 = curr;
        }
        return curr;
    }
}