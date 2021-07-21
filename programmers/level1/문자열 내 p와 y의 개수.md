```java
class Solution {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 80 || c == 112) {
                cntP = cntP + 1;
            } else if (c == 89 || c == 121) {
                cntY = cntY + 1;
            } // end if
        } // end for

        return cntP == cntY;
    }
}
```
