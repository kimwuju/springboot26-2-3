import java.util.Optional;

public class Main {
    public static Optional<String> getName() {
        return Optional.of("김우주");
    }

    public static void main(String[] args) {
        System.out.println("안녕하세요 김우주입니다");
        String name = null;
        try {
            System.out.println("name.length()" + name.length());
            System.out.println("실행");
        } catch (Exception e) {
//            e.printStackTrace();
        }

        Optional<String> optional = getName();
        optional.ifPresent(s->System.out.println(s));
    }
}
