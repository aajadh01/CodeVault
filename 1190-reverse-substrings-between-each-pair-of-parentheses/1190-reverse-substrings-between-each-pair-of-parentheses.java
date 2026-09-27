class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(sc);
                sc=new StringBuilder();
            }
            else if(s.charAt(i)==')')
            {
                    sc.reverse();
                    StringBuilder sa =  st.pop();
                    sa.append(sc);
                    sc=sa;
            }
            else
            {
                sc.append(s.charAt(i));
            }
        }
        return sc.toString();

    }
}