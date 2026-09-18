class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int Totalsum=0;
        int sum=0;
        int n=satisfaction.length;
        for(int i=0;i<n;i++){
            Totalsum+=satisfaction[i]*(i+1);
            sum+=satisfaction[i];}
        int max=0;
        max=Math.max(max,Totalsum);
        for(int i=0;i<n;i++){
            Totalsum-=sum;
            max=Math.max(max,Totalsum);
            sum-=satisfaction[i];
        }
        
        return max;
        
    }
}