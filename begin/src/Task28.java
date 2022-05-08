import java.util.Scanner;

public class Task28 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        // 2
        double b = a * a;
        System.out.print(b + " ");
        // 3
        a = b * a;
        System.out.print(a + " ");
        // 5
        b = a * b;
        System.out.print(b + " ");
        // 10
        a = b * b;
        System.out.print(a + " ");
        // 15
        b = a * b;
        System.out.print(b + " ");
    }
}
