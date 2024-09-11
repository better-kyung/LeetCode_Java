class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int values = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int value = Collections.max(map.values());

        
        for (int n : map.keySet()) {
            if (map.get(n) == value) {
                return n;
            }
        }
        
        
        return -1;
    }
}