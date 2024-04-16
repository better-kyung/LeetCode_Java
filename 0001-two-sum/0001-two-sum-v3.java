class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i); //값과 인덱스를 key, value로 넣음
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && //목표값에서 nums값을 뺀 값이 존재하고
                i != numsMap.get(target - nums[i])) { //i가 현재 인덱스가 아니라면
                    return new int[]{i, numsMap.get(target - nums[i])}; //정답
                }
        }

        return null;
    }
}