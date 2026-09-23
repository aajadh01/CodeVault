class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {

        int n = nums1.length;
      
        Arrays.sort(nums1);

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums2[i];  
            arr[i][1] = i;         
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int[] answer = new int[n];

        
        int low = 0;
        int high = n - 1;

     
        for (int i = 0; i < n; i++) {

            int value = arr[i][0];
            int originalIndex = arr[i][1];

          
            if (nums1[high] > value) {

               
                answer[originalIndex] = nums1[high];
                high--;

            } else {

                answer[originalIndex] = nums1[low];
                low++;
            }
        }

        return answer;
    }
}