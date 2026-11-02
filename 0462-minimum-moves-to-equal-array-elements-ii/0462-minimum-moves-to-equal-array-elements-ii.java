class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int val = (n%2==0) ? ( nums[n/2] + nums[(n+1)/2])/2 : nums[n/2] ;
        int ans = 0 ;
        for(int i:nums)
        {
            ans+=Math.abs(val-i);
        }
        return ans;
    }
}