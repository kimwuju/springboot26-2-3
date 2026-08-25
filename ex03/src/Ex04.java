import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex04 {
    @FunctionalInterface
    interface Colculate {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        Colculate add = (a, b) -> a + b;
        Colculate sub = (a, b) -> a - b;

        System.out.println(add.operate(10, 10));
        System.out.println(sub.operate(10, 5));
        Function<String, Integer> f1 = i -> Integer.parseInt(i);
        Function<String, Integer> f2 = Integer::parseInt;

        List<String> al = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        al.forEach(System.out::println);

        // interface Coloculate @FunctionalInterface를 만들어서
        // 추상 메서드 operate를 추가하고
        // 덧셈하는 람다식
        // 뺄셈하는 람다식을 작성해서
        // 두 수를 보내 더하기와 뺴기를 구하시오

    }
}
