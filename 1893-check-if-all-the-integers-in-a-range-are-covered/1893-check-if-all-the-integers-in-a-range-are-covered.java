class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] a = new int[51];
        for(int[] arr : ranges)
        {
            int s = arr[0];
            int e = arr[1];
            for(int i=s;i<=e;i++)
            {
                a[i]++;
            }
        }
        for(int i=left;i<=right;i++)
        {
            if(a[i]==0) return false;
        }
        return true;
    }
}