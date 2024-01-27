import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateOddEven {
    public static void seperateOddEven(List<Integer> numbers) {
        System.out.println("Even numbers are: ");
        numbers.stream().filter(a->a%2==0).forEach(a->System.out.print(a+" "));
        System.out.println("\nOdd numbers are: ");
        numbers.stream().filter(a->a%2==1).forEach(a->System.out.print(a+" "));
        System.out.println();
    }


}
