class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<>(), n, 1, k);
        return result;
    }

    public void dfs(List<List<Integer>> result, LinkedList<Integer> elements, int n, int start, int k) {
        if (k == 0) {
            result.add(elements.stream().collect(Collectors.toList()));
            return;
        }

        for (int i = start; i <= n; i++) {
            elements.add(i);
            dfs(result, elements, n, i + 1, k - 1);
            elements.removeLast();
        }
    }
}