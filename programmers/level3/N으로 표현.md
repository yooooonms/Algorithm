```java
class Solution {
    
    private int answer = -1;
    
    private void dfs(int n, int num, int cnt, int value) {
        int temp = n;
        if (cnt > 8) {
            return;
        }
        if (num == value) {
            if (answer > cnt || answer == -1) {
                answer = cnt;
            }
            return;
        }
        for (int i = 1; i < 9 - cnt; i++) {
            dfs(n, num, cnt + i, value + temp);
            dfs(n, num, cnt + i, value - temp);
            dfs(n, num, cnt + i, value * temp);
            dfs(n, num, cnt + i, value / temp);
            temp = temp * 10 + n;
        }
    }
    
    public int solution(int N, int number) {
        dfs(N, number, 0, 0);
        return answer;
    }
    
}
```
