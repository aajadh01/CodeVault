class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0 ;
        long product = 1;
        int chk = n;
        while(n>0)
        {
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        return (chk%(sum+product))==0;
    }
}