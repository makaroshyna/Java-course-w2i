import java.util.Scanner;

public class Task30 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double a = 180 / pi * r;

        System.out.println(a);
    }
}
