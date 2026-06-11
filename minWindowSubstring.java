import java.util.*;

public class MinWindowSubstring {
    public static class Solution {
        public String minWindow(String s, String t) {
            if (s == null || t == null || s.length() < t.length()) return "";
            int[] freq = new int[128];
            for (char c : t.toCharArray()) freq[c]++;

            int l = 0, r = 0, minLen = Integer.MAX_VALUE, cnt = 0;
            int startInd = -1;
            int needed = t.length();

            while (r < s.length()) {
                char rc = s.charAt(r);
                if (freq[rc] > 0) cnt++;
                freq[rc]--;

                while (cnt == needed) {
                    if (r - l + 1 < minLen) {
                        minLen = r - l + 1;
                        startInd = l;
                    }
                    char lc = s.charAt(l);
                    freq[lc]++;
                    if (freq[lc] > 0) cnt--;
                    l++;
                }
                r++;
            }

            return startInd == -1 ? "" : s.substring(startInd, startInd + minLen);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.hasNextLine() ? sc.nextLine() : "";
        String t = sc.hasNextLine() ? sc.nextLine() : "";
        Solution sol = new Solution();
        System.out.println(sol.minWindow(s, t));
        sc.close();
    }
}
