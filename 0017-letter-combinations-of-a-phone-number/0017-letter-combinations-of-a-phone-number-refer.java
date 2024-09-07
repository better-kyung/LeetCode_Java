class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        Map<Character, List<Character>> map = new HashMap<>();
        map.put('0', List.of());
        map.put('1', List.of());
        map.put('2', List.of('a', 'b', 'c'));
        map.put('3', List.of('d', 'e', 'f'));
        map.put('4', List.of('g', 'h', 'i'));
        map.put('5', List.of('j', 'k', 'l'));
        map.put('6', List.of('m', 'n', 'o'));
        map.put('7', List.of('p', 'q', 'r', 's'));
        map.put('8', List.of('t', 'u', 'v'));
        map.put('9', List.of('w', 'x', 'y', 'z'));

        dfs(result, map, digits, 0, new StringBuilder());
        return result;
    }

    public void dfs(List<String> result, Map<Character, List<Character>> dic, String digits,
    int index, StringBuilder path) {
        if (path.length() == digits.length()) {
            result.add(String.valueOf(path));
            return;
        }

        for (Character c : dic.get(digits.charAt(index))) {
            dfs(result, dic, digits, index + 1, new StringBuilder(path).append(c));
        }
    }
}