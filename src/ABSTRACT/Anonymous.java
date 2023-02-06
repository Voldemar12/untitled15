package ABSTRACT;

public class Anonymous {
    public static void main(String[] args) {
        SuperClass anonymousClass = new SuperClass() {
            @Override
            public void method2() {
                System.out.println("It's not a static method");
            }
            @Override
            public void method3() {
                System.out.println("It's a static method");
            }
        };
        anonymousClass.method2();
        anonymousClass.method3();
    }
}
