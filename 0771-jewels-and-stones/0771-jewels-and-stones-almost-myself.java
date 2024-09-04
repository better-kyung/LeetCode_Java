class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : jewels.toCharArray()) {
            if (map.containsKey(c)) {
                answer += map.get(c);
            }
        }
        return answer;
    }
}