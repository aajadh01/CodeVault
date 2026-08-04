class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = Integer.MIN_VALUE;
        int n = nums1.length;
        int m = nums2.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i<=j && nums1[i]<=nums2[j])
            {
                ans=Math.max(ans,j-i);
                j++;
            }
            else
            {
                i++;
                j++;
            }

        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}