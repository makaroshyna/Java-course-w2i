import java.util.Scanner;

public class Task23 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double D = A;
        A = C;
        C = B;
        B = D;

        System.out.println(A + " " + B + " " + C);
    }
}
