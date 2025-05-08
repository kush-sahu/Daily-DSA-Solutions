class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        String sb=new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }
}