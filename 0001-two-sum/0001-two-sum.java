class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> arr = new HashMap<>();
        for(int i = 0 ;i<nums.length;i++)
        {
            int val = target - nums[i];
            if(arr.containsKey(val))
            {
                return new int[]{i,arr.get(val)};
            }
            else
            {
                arr.put(nums[i],i);
            }
        }
        return  new int[2] ;
    }
}