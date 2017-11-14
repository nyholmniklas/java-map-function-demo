import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Looper {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> incrementedNumbers = new ArrayList<>();

        // This is sequential
        for (Integer x:numbers) {
            incrementedNumbers.add(increment(x));
        }

        System.out.println(incrementedNumbers);
    }

    public static int increment(int x) {
        x++;
        return x;
    }


}
