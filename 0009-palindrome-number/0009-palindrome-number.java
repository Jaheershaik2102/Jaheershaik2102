import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
            if (x < 0) return false; 
               int original = x;
                int rev = 0;
                while (x > 0) {
                int rem = x % 10;
                rev = rev * 10 + rem;
                 x = x / 10;
             
    }
    return original == rev;
}   
}                                    
                                                                                    