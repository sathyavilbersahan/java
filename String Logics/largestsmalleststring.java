import java.util.Collections;
import java.util.List;

public class largestsmalleststring {
    public static void main(String[] args) {
        List<String> var = List.of("apple", "orange", "banana", "pine", "strawberry");
        String small = Collections.min(var);
        String large = Collections.max(var);
        System.out.println("smallest string " + small + "largest string " + large);
    }

}
