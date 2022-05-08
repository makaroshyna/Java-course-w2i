import java.util.Scanner;

public class Task29 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double r = (pi / 180) * a;

        System.out.println(r);
    }
}
