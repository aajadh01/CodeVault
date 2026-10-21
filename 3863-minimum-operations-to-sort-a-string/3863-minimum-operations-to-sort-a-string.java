class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // 1. Already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;

        // 2. Length is 2
        if (n == 2) return -1;

        char min = 'z', max = 'a';
        int minCount = 0, maxCount = 0;

        for (char c : s.toCharArray()) {
            if (c < min) {
                min = c;
                minCount = 1;
            } else if (c == min) {
                minCount++;
            }

            if (c > max) {
                max = c;
                maxCount = 1;
            } else if (c == max) {
                maxCount++;
            }
        }

        // 4. Unique maximum at the beginning
        // and unique minimum at the end
        if (s.charAt(0) == max && maxCount == 1
                && s.charAt(n - 1) == min && minCount == 1) {
            return 3;
        }

        // 3. Minimum at the beginning or maximum at the end
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        // 5. Fallback
        return 2;
    }
}