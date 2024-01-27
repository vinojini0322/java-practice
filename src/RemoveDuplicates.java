import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void removeDuplicates(List<Integer> list){
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Duplicate Removed list : "+distinctList.toString());
    }
}
