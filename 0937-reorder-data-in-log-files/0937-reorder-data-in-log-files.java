class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        //[1] digit 과 letter 분리
        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }


        //[2] letter 정렬
        letters.sort((s1, s2) -> { //특정 조건에서 정렬하고 싶을 때 사용
            
                String[] str1 = s1.split(" ", 2);
                String[] str2 = s2.split(" ", 2);

                int compared = str1[1].compareTo(str2[1]);
                if (compared == 0) {
                    return str1[0].compareTo(str2[0]);
                } else {
                    return compared;
                }
            
        });
        //[3] letters - digits 합치기
        letters.addAll(digits);

        return letters.toArray(new String[0]);
    }
}