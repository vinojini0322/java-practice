import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        SeperateOddEven.seperateOddEven(numbers);

        List<Integer> numbersDuplicate = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        numbersDuplicate.stream().distinct().forEach(a-> System.out.println(a+" "));

        System.out.println("\nList sorted in natural order");
        numbers.stream().sorted().forEach(a -> System.out.print(a + " "));

        System.out.println("List sorted in reverse order");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.print(a + " "));
    }
}