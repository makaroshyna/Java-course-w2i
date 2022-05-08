import java.util.Scanner;

public class Task10 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double a2 = a * a;
        double b2 = b * b;

        double sum = a2 + b2;
        double sub = Math.abs(a2 - b2);
        double mul = a2 * b2;
        double div = a2 / b2;

        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }
}
