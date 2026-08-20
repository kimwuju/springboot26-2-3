interface BB {
    String doA(int a);
}
class AAAA{}
public class Ex04 {
    static void method1(BB bb, AAAA aaaa) {
        String test = bb.doA(100);
        System.out.println(test);
    }
    static void main() {
        method1( (num)-> String.valueOf(num), new AAAA());
    }
}

