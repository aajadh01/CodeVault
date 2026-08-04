class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<StringBuilder> s2 = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int val = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                val = (val * 10) + (c - '0');
            } else {
                if (c == '[') {
                    s1.push(val);
                    s2.push(currentString); 
                    val = 0;
                    currentString = new StringBuilder();
                } else if (c == ']') {
                    int count = s1.pop();
                    StringBuilder decoded = s2.pop(); 
                    for (int i = 0; i < count; i++) {
                        decoded.append(currentString);
                    }
                    currentString = decoded;
                } else {
                    currentString.append(c); 
                }
            }
        }
        return currentString.toString();
    }
}
