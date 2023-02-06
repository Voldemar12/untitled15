package ABSTRACT;

public class CreateInstance {

    public static SuperClass create() {

        SuperClass instance = new SuperClass() {
            @Override
            public void method3() {
                System.out.println();

            }
        };
        return instance;
    }
}
