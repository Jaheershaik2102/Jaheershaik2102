import java.util.*;

class Solution {
    public static int reverse(int x) {
        long rev = 0;  // Use long to detect overflow

        boolean isNegative = x < 0;
        x = Math.abs(x);

        while (x > 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }

       
        rev = isNegative ? -rev : rev;

        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;  
        }

        return (int) rev;
    }

    
    }

