class Solution {
    public boolean isPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            }
        }

        String reverse = "";

        for (int i = ans.length() - 1; i >= 0; i--) {
            reverse += ans.charAt(i);
        }

        return ans.equals(reverse);
    }
}