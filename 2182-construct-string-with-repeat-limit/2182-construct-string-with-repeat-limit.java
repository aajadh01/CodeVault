class Solution {
    public String repeatLimitedString(String s, int r) {
        int[] arr =  new int[26];
        for(char c : s.toCharArray())
        {
            arr[c-'a']++;
        }
        StringBuilder sb =  new StringBuilder();
        for(int i=25;i>=0;i--)
        {
            int t=0;
            while(arr[i]!=0)
            {
                while(arr[i]>0)
                {
                    t++;
                    if(t>r) break;
                    sb.append((char)('a'+i));
                    arr[i]--;
                    //System.out.println(sb + " " + t);
                }
                if(t>r)
                {
                   boolean change = true;
                   for(int j=25;j>=0;j--)
                   {
                       if(arr[j]!=0 && i!=j)
                       {
                         sb.append((char) ('a' + j));
                         arr[j]--;
                         t=0;
                         change=false;
                         break;
                       }
                   }
                   if(change) break;
                }
            }
        }
        return sb.toString();
    }
}