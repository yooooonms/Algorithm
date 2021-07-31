배열이 주어졌을 때 각 수의 제곱값을 오름차순으로 정렬된 배열로 반환하는 문제  

각 요소를 제곱해주고 정렬해 반환했다.

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
```
