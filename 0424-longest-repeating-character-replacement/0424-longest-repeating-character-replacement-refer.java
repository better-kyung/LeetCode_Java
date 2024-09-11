class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;

        for (int right = 1; right <= s.length(); right++) {
            counts.put(s.charAt(right - 1), counts.getOrDefault(s.charAt(right - 1), 0) + 1);

            int maxCharCount = Collections.max(counts.values());

            if (right - left - maxCharCount > k) {
                counts.put(s.charAt(left), counts.getOrDefault(s.charAt(left), 0) - 1);
                left++;
            }
        }

        return s.length() - left;
    }
}