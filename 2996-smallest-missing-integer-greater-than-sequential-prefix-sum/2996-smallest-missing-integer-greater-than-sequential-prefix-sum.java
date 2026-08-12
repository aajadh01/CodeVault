class Solution {
    public int missingInteger(int[] nums) {
        int val = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1) val+=nums[i];
            else break;
        }
        if (val>50) return val;
        int[] arr = new int[51];
        for(int n:nums)
        {
            arr[n]++;
        }
        while(val<=50)
        {
            if(arr[val]==0) return val;
            val++;
        }
        return val;
    }
}