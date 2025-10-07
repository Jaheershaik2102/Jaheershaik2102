import java.util.HashMap;
import java.util.Map;

class Solution {
    
    private static final Map<Character, Integer> romanMap = new HashMap<>();
    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            
            int currentValue = romanMap.get(currentSymbol);

            if (currentValue < prevValue) {
                result -= currentValue;
            } 
            else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}