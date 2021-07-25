```java
class Solution {
    public String solution(String s) {
                StringBuilder answer = new StringBuilder();
        boolean isFirst = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                isFirst = true;
                answer.append(" ");
                continue;
            }
            if (isFirst) {
                if (c > 96 & c < 123) {
                    answer.append((char) (c - 32));
                } else {
                    answer.append(c);
                }
                isFirst = false;
            } else {
                if (!(c > 96 & c < 123)) {
                    answer.append((char) (c + 32));
                } else {
                    answer.append(c);
                }
            }
        } // end for
        return answer.toString();
    }
}
```
