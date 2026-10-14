class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int[] arr = new int[num];
        int i=0;
        while(sum>0 && i!=num)
        {
            if(sum>=9)
            {
                arr[i]=9;
                sum-=9;
            }
            else
            {
                arr[i]=sum;
                sum-=sum;
            }
            i++;
        }
        // System.out.println(sum);
        if(sum>0) return "";
        else
        {
            StringBuilder sc = new StringBuilder();
            for(int j=0;j<num;j++)
            {
                sc.append(arr[j]);
            }
            return sc.toString();
        }
    }
}