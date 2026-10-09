class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        int ans = 0;
        for(char c: s.toCharArray())
        {
            //System.out.println(ans);
            if(c=='(')
            {
                if(cnt==0) st.push(c);
                else if(cnt>0)
                {
                    if(!st.isEmpty()) 
                    {
                        ans++;
                        st.pop();
                    }
                    else
                    {
                        ans+=(3-cnt);
                    }
                    st.push(c);
                    cnt=0;
                }
            }
            else
            {
                if(cnt==0) cnt++;
                else
                {
                    if(st.isEmpty()) 
                    {
                        ans++;
                        cnt=0;
                    }
                    else
                    {
                        st.pop();
                        cnt=0;
                    }
                }
            }
        }
        if(st.size()!=0)
        {
            int l = st.size();
            if(cnt>0)
            {
                ans+=(2-cnt);
                cnt=0;
                l--;
            }
            ans+=(l*2);
        }
        if(cnt!=0)
        {
            ans+=(3-cnt);
        }
        return ans;
    }
}