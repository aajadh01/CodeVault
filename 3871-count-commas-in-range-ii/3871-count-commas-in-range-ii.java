class Solution {
    public long countCommas(long n) {
        long x = n ;
        long c = 0 ;
        long b = 1000 ; 
        while(b<=x)
            {
                c+= x - b + 1 ;
                b*=1000;
            }
        return c;
    }
}