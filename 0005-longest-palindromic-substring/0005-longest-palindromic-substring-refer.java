class Solution {
    int left, maxLen;
    public void extendPalindrome(String s, int j, int k) { //j:시작, k:끝
        //범위에 맞는동안 글자가 같다면 점점 확장
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        //끝 - 시작 - 1의 값(즉, 팰린드롬의 길이)이(가) maxLen보다 크면 maxLen을 바꿈
        if (maxLen < k - j - 1) {
            left = j + 1; //시작점과
            maxLen = k - j - 1; //끝점
        }
    }

    public String longestPalindrome(String s) {
        int len = s.length();

        if (len < 2) { //주어진 길이가 1개면 그대로 돌려준다.
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i + 1); //한칸씩 이동
            extendPalindrome(s, i, i + 2); //두칸씩 이동
        }

        return s.substring(left, left + maxLen); //시작점부터 끝점까지 substring
    }
}