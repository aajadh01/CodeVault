class Solution {
    public boolean sumGame(String num) {
         int rh = 0;
         int lh = 0;
         int rc = 0;
         int lc = 0;
         for(int i=0;i<num.length()/2;i++)
         {
            if(num.charAt(i)=='?') lc++;
            else lh+=(num.charAt(i)-'0');
         }
         for(int i=num.length()/2;i<num.length();i++)
         {
            if(num.charAt(i)=='?') rc++;
            else rh+=(num.charAt(i)-'0');
         }
         if((lh-rh)*2==(rc-lc)*9) return false;
         return true;
    }
}