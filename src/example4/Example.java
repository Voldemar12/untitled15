package example4;

public class Example {
    public static void main(String[] args) {
        final String robotName = "Bug";
        final int robotAssamblyYear = 2112;

        SpeakingEntity robot = new SpeakingEntity() {

            static final int MAGIC_CONSTANT = 10;
            private String name;
            private int assemblyYear;
            {
                name = robotName;
                assemblyYear = robotAssamblyYear;
            }
            @Override
            public void sayHello() {
                System.out.println("1010001" + MAGIC_CONSTANT);
            }

            @Override
            public void saBye() {
                System.out.println("0100110" + MAGIC_CONSTANT);
            }
        };
    }
}
