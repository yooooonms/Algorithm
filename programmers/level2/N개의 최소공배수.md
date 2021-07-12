```java
class Solution {
    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    public int solution(int[] arr) {
        int len = arr.length;
        
        int answer = arr[0];
        for (int i = 1; i < len; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
}
```
