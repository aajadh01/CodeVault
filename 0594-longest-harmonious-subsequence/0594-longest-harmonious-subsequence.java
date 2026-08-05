class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(arr.containsKey(nums[i]+1))
            {
                ans=Math.max(ans,arr.get(nums[i]+1)+arr.get(nums[i]));
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}