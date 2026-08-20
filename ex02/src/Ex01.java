interface DoA {
    void doA();
    default void doB() {
        System.out.println("doB");
    }
    static void doC() {
        System.out.println("doC");
    }
}

public class Ex01 {
    static void main() {
        DoA doA = new DoA() {
            public void doA() {
                System.out.println("test1111");
            }
        };
        DoA d1 = ()-> System.out.println("test2222");
        doA.doA();
        d1.doA();
        d1.doB(); // default
        DoA.doC(); // static
    }
}
