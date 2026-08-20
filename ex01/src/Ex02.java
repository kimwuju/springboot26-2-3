import java.util.Optional;

public class Ex02 {
    // 자동 정렬 option + command + l
    public static void main(String[] args) {
        // Optional 안에 hello 담아서 꺼내서 출력하기
        System.out.println(Optional.of("Hello").get());

        System.out.println(Optional.empty().orElse("빈 값"));

        System.out.println(Optional.ofNullable(null).orElse("기본값"));

        String name = null;
        System.out.println(name.length());
        Optional.ofNullable(name).ifPresent(n -> System.out.println(n.length()));

        Optional<String> drink = Optional.ofNullable(null);
        System.out.println(drink.orElse("물"));
    }
}
