class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=requests[0];
        for(int i=0;i<requests.length-1;i++)
        {
            ans+=Math.abs(requests[i]-requests[i+1]);
        }
        return ans;
    }
}