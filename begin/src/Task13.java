import java.util.Scanner;

public class Task13 {

    public static void run() {
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();

        double S1 = pi * R1 * R1;
        double S2 = pi * R2 * R2;
        double S3 = S1 - S2;

        System.out.println(S1 + " " + S2 + " " + S3);
    }
}
