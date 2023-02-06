package example2;

public class main {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run boy run!");
            }
        });
        t.run();
    }
}
