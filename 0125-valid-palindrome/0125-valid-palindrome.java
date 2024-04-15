class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) { // 앞 문자열이 조건 만족?
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) { // 뒷 문자열이 조건 만족?
                end--;
            } else { // 둘다 만족 한다면
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) { // 그 둘의 문자열이 달라?
                    return false; // 다르면 팰린드롬 아님
                }

                // 인덱스 이동
                start++;
                end--;
            }
        }
        return true;
    }
}