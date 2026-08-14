class Solution {
    public int maximumLengthSubstring(String s) {
        int[] arr = new int[26];
        int ans = 0;
        int left = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            arr[c-'a']++;
                while(arr[c-'a']>2)
                {
                    arr[s.charAt(left)-'a']--;
                    left++;
                }
                ans=Math.max(i-left+1,ans);
        }
        return ans;
    }
}