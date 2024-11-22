import java.util.ArrayList;
import java.util.List;

public class Let412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            var p = new StringBuilder();
            if ((i) % 3 == 0)  p.append("Fizz");
            if ((i) % 5 == 0)  p.append("Buzz");
            if (p.length() == 0)         p.append(i);
            result.add(p.toString());
        }
        return result;        
    }
}
