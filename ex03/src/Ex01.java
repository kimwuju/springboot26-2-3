import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Ex01 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100);
        System.out.println(s.get());
        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);

        // 소비, 반환값이 없고 매개변수를 받아 소비하는 역할
        Consumer<Integer> c = x -> System.out.println(x);
        c.accept(100);
        printList(c, list);

        Function<Integer, String> f = x -> "x를 두번 더하면 " + (x + x) + "입니다";
        System.out.println(f.apply(100));

        Predicate<String> pr = s1 -> s1.equals("abcd");
        System.out.println(pr.test("abcd"));
        System.out.println(pr.test("area"));

        BiConsumer<String, String> bic = (x, y) -> {
            System.out.println("이름은 " + x + "입니다");
            System.out.println("나이는 " + y + "입니다");
        };
        bic.accept("홍길동", "20");
    }

    private static void printList(Consumer<Integer> c, List<Integer> list) {
        list.forEach(c);
    }

    public static <T> void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
