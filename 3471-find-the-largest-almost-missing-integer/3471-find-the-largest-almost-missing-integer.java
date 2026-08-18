import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> map1 = new HashSet<>();
            
            for (int j = i; j < k + i; j++) {
                map1.add(nums[j]);
            }
            
            for (int num : map1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        System.out.println(map);
        int ans = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
