class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int n : nums) high = Math.max(high,n);
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            long sum  = 0;
            for(int n : nums){
                sum += (int) Math.ceil((double)n/mid);
            }
            if(sum <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}