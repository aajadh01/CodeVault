class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int n = s.length;
        int ans = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int cnt = 1;
            for(int j=i;j<n;j++)
            {
                sum+=(s[j]*cnt);
                cnt++;
            }
            if(sum>0) ans = Math.max(sum,ans);
            sum=0;
        }
        return ans;
    }
}