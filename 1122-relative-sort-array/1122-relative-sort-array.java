class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            arr.put(arr1[i],arr.getOrDefault(arr1[i],0)+1);
            set.add(arr1[i]);
        }
        int j=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int k=0;k<arr.get(arr2[i]);k++)
            {
                arr1[j]=arr2[i];
                j++;
            }
            set.remove(arr2[i]);
        }
        if(!set.isEmpty())
        {
           for(int a : set)
           {
                for(int k=0;k<arr.get(a);k++)
                {
                    arr1[j]=a;
                    j++;
                }
           }
        }
        return arr1;
    }
}