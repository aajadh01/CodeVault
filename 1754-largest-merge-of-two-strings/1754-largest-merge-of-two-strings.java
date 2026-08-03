class Solution {
    public String largestMerge(String w1, String w2) {
        int l1 = w1.length();
        int l2 = w2.length();

        StringBuilder s = new StringBuilder();

        int i = 0, j = 0;

        while (i < l1 && j < l2) {

            if (w1.charAt(i) > w2.charAt(j)) {
                s.append(w1.charAt(i));
                i++;
            }
            else if (w1.charAt(i) < w2.charAt(j)) {
                s.append(w2.charAt(j));
                j++;
            }
            else {

                int pi = i;
                int pj = j;
                boolean fp = false;

                while (i < l1 && j < l2) {

                    if (w1.charAt(i) != w2.charAt(j)) {

                        if (w1.charAt(i) > w2.charAt(j)) {
                            s.append(w1.charAt(pi));
                            i = pi + 1;
                            j = pj;
                        } else {
                            s.append(w2.charAt(pj));
                            i = pi;
                            j = pj + 1;
                        }

                        fp = true;
                        break;
                    }

                    i++;
                    j++;
                }

                if (!fp) {

                    if (i == l1) {
                        s.append(w2.charAt(pj));
                        i = pi;
                        j = pj + 1;
                    } else {
                        s.append(w1.charAt(pi));
                        i = pi + 1;
                        j = pj;
                    }
                }
            }
        }

        while (i < l1)
            s.append(w1.charAt(i++));

        while (j < l2)
            s.append(w2.charAt(j++));

        return s.toString();
    }
}