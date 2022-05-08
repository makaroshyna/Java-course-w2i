import java.util.Scanner;

public class Task22 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double C = A;
        A = B;
        B = C;

        System.out.println(A + " " + B);
    }
}
