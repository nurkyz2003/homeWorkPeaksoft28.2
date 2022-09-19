import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Summa elementov: " + sum);
        int arif = sum/ list.size();
        System.out.println("Arifmeticheskaya elementov: " + arif);
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        System.out.println("Kolichestvo povtoryayushihsya elementov : " + map);
    }
}