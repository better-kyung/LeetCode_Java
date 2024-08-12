class Solution {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        String replaceStr = s.replaceAll(regex, "").toLowerCase();
        // System.out.println("replaceStr = " + replaceStr);

        if (replaceStr.equals("")) {
            return true;
        }

        int start = 0;
        int end = replaceStr.length() - 1;

        while (start < end) {
            // System.out.println(replaceStr.charAt(start) + " , " + replaceStr.charAt(end));
            if (replaceStr.charAt(start) != replaceStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}