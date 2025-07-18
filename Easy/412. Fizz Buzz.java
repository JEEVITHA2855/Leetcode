import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String value = "";
            if (i % 3 == 0) value += "Fizz";
            if (i % 5 == 0) value += "Buzz";
            if (value.isEmpty()) value = String.valueOf(i);
            result.add(value);
        }
        return result;
    }
}
