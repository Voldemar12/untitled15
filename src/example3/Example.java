package example3;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.divine(a, b, new Callback() {
            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d это %d ", a, b, result);
                print(textToPrint);

            }

            @Override
            public void failed(String errorSMD) {
                print(errorSMD);

            }
        });

    }
    public static void print(String result) {
        System.out.println(result);
    }
}
