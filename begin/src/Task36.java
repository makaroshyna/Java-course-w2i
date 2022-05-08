import java.util.Scanner;

public class Task36 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();
        double s = sc.nextDouble();
        double t = sc.nextDouble();

        double s1 = s + t * (v1 + v2);

        System.out.println(s1);
    }
}
