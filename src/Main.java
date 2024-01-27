import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println("Odd number list");
        numbers.stream().filter(a -> a % 2 == 1).forEach(a -> System.out.print(a + " "));

        System.out.println("\nEven number list");
        numbers.stream().filter(a -> a % 2 == 0).forEach(a -> System.out.print(a + " "));

        List<Integer> numbersDuplicate = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        System.out.println("\nDuplicates removed list");
        numbersDuplicate.stream().distinct().forEach(a -> System.out.print(a + " "));

        System.out.println("\nList sorted in natural order");
        numbers.stream().sorted().forEach(a -> System.out.print(a + " "));

        System.out.println("\nList sorted in reverse order");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.print(a + " "));

        System.out.println("\nGet the multiples of five from the list");
        numbers.stream().filter(a -> a % 5 == 0).forEach(a -> System.out.print(a + " "));

        System.out.println("\nGet the maximum and minimum from the list");
        System.out.println("Maximum value "+numbers.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Minimum value "+numbers.stream().min(Comparator.naturalOrder()).get());
    }
}