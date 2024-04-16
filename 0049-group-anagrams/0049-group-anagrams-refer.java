class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>(); 

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!answer.containsKey(key)) { //정렬한 key가 map에 없다면
                answer.put(key, new ArrayList<>()); //일단 key와 빈 리스트를 삽입
            }
            answer.get(key).add(s); //그리고 그 키를 갖는 리스트에 문자열 삽입
        }

        return new ArrayList<>(answer.values()); //이중 리스트로 변환
    }
    
}