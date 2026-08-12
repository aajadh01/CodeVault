class Solution {
    public int[] frequencySort(int[] nums) {
        int[][] arr = new int[201][2];
        for(int n:nums)
        {
            arr[n+100][0]=n;
            arr[n+100][1]++;
        }
        Arrays.sort(arr,(a,b)->{
        if(a[1]==b[1])
        {
            return Integer.compare(b[0],a[0]);
        }
        else
        {
            return Integer.compare(a[1],b[1]);
        }
    });
        //System.out.println(Arrays.deepToString(arr));
        int idx=0;
        for(int i=0;i<201;i++)
        {
            if(arr[i][1]>0)
            {
               for(int j=0;j<arr[i][1];j++)
               { nums[idx]=arr[i][0];
                idx++;}
            }
        }
        return nums;
    }
}