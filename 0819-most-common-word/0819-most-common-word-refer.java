class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //[1] 특수 문자 제거 및 띄어쓰기로 분리
        String replaced = paragraph.replaceAll("\\W+", " ");
        String[] splited = replaced.split(" ");
        List<String> list = new ArrayList<>();

        //[2] banned 된 문자 삭제
        for (String s : splited) {
            if (!Arrays.asList(banned).contains(s)) {
                list.add(s.toLowerCase());
            }
        }
        System.out.println(list);

        //[3] 가장 많은 문자 찾기
        //map 함수 만들어 놓고 key-value 연결?
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            count.put(list.get(i), count.getOrDefault(list.get(i), 0) + 1);
        }

        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
