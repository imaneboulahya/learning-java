/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x >= 0){
            int j = 0;
            int i = x;
            while (x > 0){
                j = j * 10 + (x % 10);
                x = x/10;
            }
            if (i == j){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
