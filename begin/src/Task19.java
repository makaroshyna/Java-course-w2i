import java.util.Scanner;

public class Task19 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double a = Math.abs(x1 - x2);
        double b = Math.abs(y1 - y2);

        double P = 2 * (a + b);
        double S = a * b;

        System.out.println(P + " " + S);
    }
}
