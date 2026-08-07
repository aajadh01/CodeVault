class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(arr.get(nums[i])==1)
            {
                int x = nums[i];
                if(!(arr.containsKey(x+1)) && !(arr.containsKey(x-1)))
                {
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}