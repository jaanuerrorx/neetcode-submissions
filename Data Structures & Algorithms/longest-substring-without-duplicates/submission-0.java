class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> count = new HashSet<>();
        int left = 0;
        int ans =0;
        for(int r=0;r<s.length();r++){
            while(count.contains(s.charAt(r))){
                count.remove(s.charAt(left++));
            }
            count.add(s.charAt(r));
            ans = Math.max(ans, r - left + 1);
        }
        return ans;
        
    }
}
