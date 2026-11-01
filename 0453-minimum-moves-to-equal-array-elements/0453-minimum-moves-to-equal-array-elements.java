class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        int ans=0;
        //System.out.println(min);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min) ans+=(nums[i]-min);
        }
        return ans;
    }
}