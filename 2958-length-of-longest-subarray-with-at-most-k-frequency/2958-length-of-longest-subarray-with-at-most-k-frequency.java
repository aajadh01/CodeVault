class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],1);
        int start=0;
        for(int i=1;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>k)
            {
                while(map.get(nums[i])>k)
                {
                    map.put(nums[start],map.get(nums[start])-1);
                    start++;
                }
            }
            else
            {
                ans=Math.max(ans,(i-start)+1);
            }
        }
        return ans;
    }
}