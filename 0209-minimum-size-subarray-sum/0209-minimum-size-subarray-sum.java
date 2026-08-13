class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int right=-1;
        int len=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>=target)
            {
                right=i;
                break;
            }
        }
        if(right==-1) return 0;
        len=right-left+1;
       while(right<nums.length)
        {
            if(len==1) return 1;
            sum-=nums[left];
            left++;
            if(sum>=target)
            {
                int check = right - left + 1 ;
                if(len>check) len=check;
            }
            else
            {
                while(sum<target)
                {
                    right++;
                    if(right>=nums.length) return len;
                    sum+=nums[right];
                }
                int check= right - left + 1;
                if(len>check) len = check;
            }
        }
        return len;
    }
}