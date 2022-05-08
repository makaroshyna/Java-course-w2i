import java.util.Scanner;

public class Task7 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        double L = 2 * pi * R;
        double S = pi * R * R;

        System.out.println(L + " " + S);
    }
}
