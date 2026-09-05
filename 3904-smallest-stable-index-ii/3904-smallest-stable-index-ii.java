class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ; 
        int ans = Integer.MAX_VALUE ;
        int[] h = new int[nums.length];
        int[] l = new int[nums.length];
        for(int i =0 ;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            h[i] = max;
            min = Math.min(min,nums[nums.length-1-i]);
            l[nums.length-1-i] = min;
        }
        //System.out.println(Arrays.toString(h)+" "+Arrays.toString(l));
        for(int i=0;i<nums.length;i++)
        {
            int val = h[i] - l [i];
            if(val<=k)
            {
                return i ;
            }
        }
        return -1;
    }
}