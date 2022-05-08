import java.util.Scanner;

public class Task24 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double D = A;
        A = B;
        B = C;
        C = D;

        System.out.println(A + " " + B + " " + C);
    }
}
