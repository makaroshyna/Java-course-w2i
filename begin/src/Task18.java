import java.util.Scanner;

public class Task18 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double AC = Math.abs(A - C);
        double BC = Math.abs(B - C);
        double mul = AC * BC;

        System.out.println(mul);
    }
}
