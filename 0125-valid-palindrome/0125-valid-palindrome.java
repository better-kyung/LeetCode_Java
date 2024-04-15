class Solution {
    public boolean isPalindrome(String s) {
        // [1] 문자열 정리 (대소문자, 띄어쓰기, 알파벳이 아닌 문자들 제거)
        s = s.toLowerCase();
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((97 <= c && c <= 122) || (48 <= c && c <= 57)) {
                newStr += String.valueOf(s.charAt(i));
            }
        }

        // [2] 역방향 문자열과 정방향 문자열이 같은지 확인
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
