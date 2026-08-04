class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int min=101,max=-1;
         int i;
         for(i=0;i<nums.length;i++)
         {
            if(nums[i]<min)
            {
                min=nums[i];

            }
            if(nums[i]>max)
            {
                max=nums[i];
            }
         }
        int n=max+1;
        int a[]=new int[n];
       
        for(i=0;i<n;i++)
        {
            a[i]=0;
        }
        for(i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        for(i=min;i<n;i++)
        {
            if(a[i]==0)
            {
                li.add(i);
            }
        }
        return li;
    }
}