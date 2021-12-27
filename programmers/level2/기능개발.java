```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        int[] days = new int[size];
        for (int i = 0; i < size; i++) {
            int progress = 100 - progresses[i];
            int speed = speeds[i];
            if (progress % speed != 0) {
                days[i] = (progress / speed) + 1;
            } else {
                days[i] = (progress / speed);
            }
        }
        List<Integer> list = new ArrayList<>();
        int done = 1;
        int job = days[0];
        for (int i = 1; i < size; i++) {
            if (job < days[i]) {
                list.add(done);
                job = days[i];
                done = 1;
            } else {
                done = done + 1;
            }
        }
        list.add(done);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
```
