class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> fromToMap = new HashMap<>();

        for (List<String> ticket : tickets) {
            fromToMap.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            fromToMap.get(ticket.get(0)).add(ticket.get(1));
        }

        List<String> results = new LinkedList<>();
        // dfs(results, fromToMap, "JFK");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("JFK");

        while (!stack.isEmpty()) {
            while(fromToMap.containsKey(stack.getFirst()) && !fromToMap.get(stack.getFirst()).isEmpty()) {
                stack.push(fromToMap.get(stack.getFirst()).poll());
            }
            results.add(0, stack.pop());
        }
        return results;
    }

    // public void dfs(List<String> results, Map<String, PriorityQueue<String>> fromToMap, String from) {
    //     while (fromToMap.containsKey(from) && !fromToMap.get(from).isEmpty()) {
    //         dfs(results, fromToMap, fromToMap.get(from).poll());
    //     }
    //     results.add(0, from);
    // }
}