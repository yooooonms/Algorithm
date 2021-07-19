```java
import java.util.Arrays;

class Solution {
    public int getK(int[] array, int start, int end, int k) {
        int[] temp = new int[end - start + 1];
        int idx = 0;
        
        for (int i = start - 1; i < end; i++, idx++) {
            temp[idx] = array[i];
        }
        
        Arrays.sort(temp);
        
        return temp[k - 1];
        
    }
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i ++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            answer[i] = getK(array, start, end, k);

        } // end for

        return answer;
    }
}
```
