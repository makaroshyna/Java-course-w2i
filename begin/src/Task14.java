import java.util.Scanner;

public class Task14 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double L = sc.nextDouble();

        double R = L / (2 * pi);
        double S = pi * R * R;

        System.out.println(R + " " + S);
    }
}
