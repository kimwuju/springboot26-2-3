import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        // 정수를 16진수로 변환
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        // 정수를 2진수로 변환
        Function<Integer, String> f2 = (i) -> Integer.toString(i, 2);

        Function<String, String> andThenf = f.andThen(f2);
        System.out.println(andThenf.apply("10"));
    }
}
