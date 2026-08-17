class Solution {
    static int[][] t= new int[501][501];
    private static int solve(int l,int r,int[] p)
    {
        if(l>=r) return 0;
        if(t[l][r]!=-1)
        {
            return t[l][r];
        }
        int val = 0;
        for(int mid=l;mid<r;mid++)
        {
            int lsum = p[mid] - (l-1>=0?p[l-1]:0);
            int rsum = p[r] - p[mid];
            if(lsum<rsum)
            {
                val = Math.max(val,lsum+solve(l,mid,p));
            }
            else if(lsum>rsum)
            {
                val = Math.max(val,rsum+solve(mid+1,r,p));
            }
            else
            {
                val = Math.max(val,Math.max(lsum+solve(l,mid,p),rsum+solve(mid+1,r,p)));
            }
        }
        return t[l][r]=val;
    }
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] psum = new int[n];
        psum[0] = stoneValue[0];
        for(int i=1;i<n;i++)
        {
            psum[i] = psum[i-1] + stoneValue[i];
        }
        for (int[] row : t)  Arrays.fill(row, -1);
        return solve(0,n-1,psum);
    }
}