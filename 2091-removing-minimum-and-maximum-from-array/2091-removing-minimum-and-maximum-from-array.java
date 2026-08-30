class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length+1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minidx = 0;
        int maxidx = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                maxidx = i+1;
            }
            if(min>nums[i])
            {
                min=nums[i];
                minidx = i+1;
            }
        }
        int front = Math.max(minidx,maxidx);
        int back = n - Math.min(minidx,maxidx);
        int fb1 = minidx + (n - maxidx);
        int fb2 = maxidx + (n - minidx);
        //System.out.println(minidx + " " + maxidx);
        //System.out.println(front + " " + back + " " + fb1 + " " + fb2);
        return Math.min(front,Math.min(back,Math.min(fb1,fb2)));
    }
}