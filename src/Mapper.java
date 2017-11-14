import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapper {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> incrementedNumbers = new ArrayList<>();

        // This is also sequential, but declarative
        numbers.stream()
                .map(Mapper::increment)
                .forEach(x -> incrementedNumbers.add(x));

        System.out.println(incrementedNumbers);
    }

    public static int increment(int x) {
        x++;
        return x;
    }


}
