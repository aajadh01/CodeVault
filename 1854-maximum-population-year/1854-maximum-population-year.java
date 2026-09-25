class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int i=0;i<logs.length;i++)
        {
            for(int j=logs[i][0];j<logs[i][1];j++)
            {
                arr[j-1950]++;
            }
        }
        int max =  arr[0];
        int ans = 1950;
        for(int i=1;i<101;i++)
        {
            if(max<arr[i])
            {
                ans=1950+i;
                max=arr[i];
            }
        }
        return ans;
    }
}