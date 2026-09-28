class Solution {
    public int maxDepth(String s) {
        int cnt = 0 ;
        int ans = 0 ;
        for(char c : s.toCharArray())
        {
            if(c=='(') cnt++;
            else if(c==')') cnt--;
            ans = Math.max(ans,cnt);
        }
        return ans;
    }
}