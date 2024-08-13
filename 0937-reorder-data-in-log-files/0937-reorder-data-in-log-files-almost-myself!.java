class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> numList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        for (String log : logs) {
            String[] split = log.split(" ");
            if (split[1].matches("[+-]?\\d*(\\.\\d+)?")) {
                numList.add(log);
                // System.out.println("숫자 log = " + log);
            } else {
                strList.add(log);
                // System.out.println("문자 log = " + log);
            }
        }
        strList.sort((o1, o2) -> { //자바 8이상에서는 람다 표현식으로 Comparator 대체 가능
            String[] o1s = o1.split(" ", 2); //식별자와 그 외 부분 2부분으로 나누는 것
            String[] o2s = o2.split(" ", 2);

            if (o1s[1].equals(o2s[1])) {
                return o1s[0].compareTo(o2s[0]);
            }
            return o1s[1].compareTo(o2s[1]); //그럼 여기서 식별자 제외해서 사전순으로 정렬함
        });

        strList.addAll(numList);

        //List를 String[]으로 변환하는 법
        return strList.toArray(new String[0]);
    }
}