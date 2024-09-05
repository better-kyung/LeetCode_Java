class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && left <= map.get(c)) {
                left = map.get(c) + 1;
            } else {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            
            map.put(c, right);
            right++;
        }
        return maxLength;
    }
}