import java.util.Scanner;

public class Task15 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double S = sc.nextDouble();

        double R = Math.sqrt(S / pi);
        double D = 2 * R;
        double L = 2 * pi * R;

        System.out.println(D + " " + L);
    }
}
