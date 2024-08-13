class Solution {
    int left, maxLen;

    public String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }

    private void extendPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (maxLen < j - i - 1) {
            left = i + 1;
            maxLen = j - i - 1;
        }
    }
}