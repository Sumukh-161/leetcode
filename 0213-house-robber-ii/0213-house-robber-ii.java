class Solution {
    public int solve(int[] nums, int start, int end){
        if(start == end ) return nums[end];
        int[] dp1 = new int[end-start+1];
        dp1[0] = nums[start];
        dp1[1]=Math.max(nums[start],nums[start+1]);
        for(int i = 2 ; i<dp1.length ; i++){
            int take = nums[start + i ] + dp1[i - 2];
            int skip = dp1[i - 1];
            dp1[i]=Math.max(take , skip);
        }
        return dp1[dp1.length - 1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        //dp1[1]=Math.max(nums[0],nums[1]);
        int case1 = solve(nums,0,n-2);
        int case2 = solve(nums,1,n-1);
        return Math.max(case1,case2);
    }
}