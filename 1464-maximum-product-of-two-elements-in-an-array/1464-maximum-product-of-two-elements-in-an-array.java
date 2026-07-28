class Solution {
    public int maxProduct(int[] nums) {
        int large = -1;
        int slarge =-1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= large){
            slarge = large;
            large = nums[i];
            }
            else if(nums[i] > slarge && nums[i] <= large){
                slarge = nums[i];
            }
        }
        return ((large - 1)*(slarge -1));
    }
}