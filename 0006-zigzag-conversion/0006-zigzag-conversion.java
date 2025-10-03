class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2 || numRows > s.length())
            return s;

        // Use StringBuilder instead of String
        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            // Vertical down
            for (int ind = 0; ind < numRows && i < s.length(); ind++) {
                ans[ind].append(s.charAt(i++));
            }
            // Diagonal up
            for (int ind = numRows - 2; ind > 0 && i < s.length(); ind--) {
                ans[ind].append(s.charAt(i++));
            }
        }

        
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : ans) {
            res.append(sb);
        }

        return res.toString();
    }
}