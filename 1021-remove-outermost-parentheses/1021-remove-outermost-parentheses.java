class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder str =  new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c=='(' &&  cnt==0) cnt++;
            else if(c=='(' && cnt>0) 
            {
                str.append(c);
                cnt++;
            }
            else
            {
                cnt--;
                if(cnt>0) str.append(c);
            }
        }
        return str.toString();
    }
}