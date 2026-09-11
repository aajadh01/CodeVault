class Solution {
    public int totalNumbers(int[] digits) {
        int[] dig = new int[10] ;
        int cnt = 0 ;
        for(int i=0;i<digits.length;i++)
        {
            dig[digits[i]]++;
        }
        for(int i=1;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                for(int k=0;k<=8;k+=2)
                {
                    if(i==j && i==k && dig[i]>=3) cnt++; 
                    else if(i==j && i!=k && dig[i]>=2 && dig[k]>0) cnt++;
                    else if(i==k && i!=j && dig[i]>=2 && dig[j]>0) cnt++;
                    else if(j==k && i!=k && dig[j]>1 && dig[i]>0) cnt++; 
                    else if(i!=j && i!=k && j!=k && dig[i]>0 && dig[j]>0 && dig[k]>0) cnt++; 
                }
            }
        }
        return cnt;
    }
}