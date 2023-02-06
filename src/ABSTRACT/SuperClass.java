package ABSTRACT;

abstract class SuperClass {

    public static void method1() {
        System.out.println("It's a static method.");
    }

    public void method2() {
        System.out.println("It's not a static method.");
    }

    public abstract void method3();
}
