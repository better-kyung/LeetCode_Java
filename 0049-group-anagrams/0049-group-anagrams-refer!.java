class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        

        if (strs.length == 1 || strs.length == 0) {
            return List.of(Arrays.asList(strs));
        }

        for (String str : strs) {
            //문자열을 정렬해서 다시 새로운 문자열을 만들고
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String newStr = new String(temp);
            
            //그 새로운 문자열을 키로 해서 list 생성
            if (!map.containsKey(newStr)) {
                map.put(newStr, new ArrayList<>());
            }
            //그 key를 찾아서 원래의 값 넣음
            map.get(newStr).add(str);
        }

        
        return new ArrayList<>(map.values());
    }
}