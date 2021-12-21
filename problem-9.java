class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String number = Integer.toString(x);
        return number.equals(new StringBuilder(number).reverse().toString());
    }
}
