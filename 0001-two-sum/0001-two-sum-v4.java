class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        
        //하나의 for문으로 줄이기
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{i, numsMap.get(target - nums[i])}; //정답
            }

            //키가 없으면 다음번 비교를 위해 인덱스를 저장
            numsMap.put(nums[i], i);
        }

        return null;
    }
}