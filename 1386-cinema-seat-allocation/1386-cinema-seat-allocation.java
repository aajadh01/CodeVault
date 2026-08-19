class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        int ans = 0;

        Map<Integer, Set<Integer>> a = new HashMap<>();

        for (int[] x : r) {
            int row = x[0];
            int seat = x[1];

            a.putIfAbsent(row, new HashSet<>());
            a.get(row).add(seat);
        }

        ans += (n - a.size()) * 2;

        for (Set<Integer> seats : a.values()) {

            boolean left = true;   
            boolean middle = true; 
            boolean right = true;  

            for (int seat = 2; seat <= 5; seat++) {
                if (seats.contains(seat)) {
                    left = false;
                    break;
                }
            }

            for (int seat = 4; seat <= 7; seat++) {
                if (seats.contains(seat)) {
                    middle = false;
                    break;
                }
            }

            for (int seat = 6; seat <= 9; seat++) {
                if (seats.contains(seat)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                ans += 2;
            } else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}