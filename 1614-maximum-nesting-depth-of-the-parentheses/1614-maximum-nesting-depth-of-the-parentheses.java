class Solution {
    public int maxDepth(String s) {
        int maxcounter = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                counter++;
                maxcounter = Math.max(maxcounter, counter);
            } else if (currentChar == ')') {
                counter--;
            }
        }
        maxcounter = Math.max(maxcounter, counter);

        return maxcounter;
    }
}