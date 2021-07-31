1과 0으로 이루어진 배열에서 연속으로 1이 나오는 제일 큰 수 찾는 문제이다.  

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt = cnt + 1;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        } // end for
        return max;
    }
}
```
