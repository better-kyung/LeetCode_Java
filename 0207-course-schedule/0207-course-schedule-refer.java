class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> finishToTake = new HashMap<>();
        for (int[] pre : prerequisites) {
            finishToTake.putIfAbsent(pre[0], new ArrayList<>());
            finishToTake.get(pre[0]).add(pre[1]);
        }

        List<Integer> takes = new ArrayList<>();
        List<Integer> taken = new ArrayList<>();

        for (Integer finish : finishToTake.keySet()) {
            if (!dfs(finishToTake, finish, takes, taken)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> finishToTake, Integer finish, List<Integer> takes, 
    List<Integer> taken) {
        if (takes.contains(finish)) {
            return false;
        }

        if (taken.contains(finish)) {
            return true;
        }

        if (finishToTake.containsKey(finish)) {
            takes.add(finish);
            for (Integer take : finishToTake.get(finish)) {
                if (!dfs(finishToTake, take, takes, taken)) {
                    return false;
                }
            }
            takes.remove(finish);
            taken.add(finish);
        }
        return true;
    }
}