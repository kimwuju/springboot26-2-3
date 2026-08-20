import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        // Optional 생성 방식 3가지
        int a = 10;
        // 10
        Optional<Integer> intopt = Optional.of(10);
        // ofNullable은 null일 수도 있고 값일 수도 있다.
        Optional<String> stropt = Optional.ofNullable(null);
        // empty는 null이다
        Optional<String> stropt2 = Optional.empty();

        // Optional get orElse ifPresent
        System.out.println(intopt.get());
        System.out.println(stropt.orElse("기본값설정"));
        if (stropt2.isPresent()) {
            System.out.println(stropt2.get());
        } else {
            System.out.println("값이 없음");
        }
    }
}
