import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelMapper {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> incrementedNumbers = Collections.synchronizedList(new ArrayList<>());

        // This is also parallel and works :)
        incrementedNumbers = numbers.stream().parallel()
                .map(ParallelMapper::increment)
                .collect(Collectors.toList());

        System.out.println(incrementedNumbers);
    }

    public static int increment(int x) {
        x++;
        return x;
    }


}
