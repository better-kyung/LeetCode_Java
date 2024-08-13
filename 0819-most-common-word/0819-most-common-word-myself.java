class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[!?',;.]", " ");
        String[] arr = str.split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s.toLowerCase(), map.getOrDefault(s.toLowerCase(), 0) + 1);
        }

        for (String s : banned) {
            if (map.containsKey(s.toLowerCase())) {
                map.remove(s.toLowerCase());
            }
        }

        Integer max = Collections.max(map.values());

        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                return s;
            }
        }

        return null;
    }
}