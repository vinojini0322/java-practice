import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> numbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        SeperateOddEven.seperateOddEven(numbers);
        List<Integer> numbersDuplicate = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87,71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        RemoveDuplicates.removeDuplicates(numbersDuplicate);
    }
}