import java.util.Scanner;

public class Task17 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double AC = Math.abs(A - B);
        double BC = Math.abs(B - C);
        double sum = AC + BC;

        System.out.println(AC + " " + BC + " " + sum);
    }
}
