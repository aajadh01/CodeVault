class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>2)
            {
                ans=Math.max(i-left,ans);
                while(map.get(c)>2)
                {
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
            }
            else
            {
                ans=Math.max(i-left+1,ans);
            }
        }
        return ans;
    }
}