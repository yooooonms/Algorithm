정수로 이루어진 배열이 주어졌을 때 짝수 자릿수를 가진 요소의 수를 반환하는 문제  

문제에서 주어진 최대값이 100,000 이기에 짝수 자릿수가 될 수 있는 수는 10~99, 1000~9999, 100,000 밖에 없기 때문에 여기에 해당하는 수만 카운트해주면 쉽게 답을 구할 수 있다.  

```java
class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10 && nums[i] <= 99 || nums[i] >= 1000 && nums[i] <= 9999 || nums[i] == 100000) {
                cnt = cnt + 1;
            }
        } // end for
        return cnt;
    }
}
```
