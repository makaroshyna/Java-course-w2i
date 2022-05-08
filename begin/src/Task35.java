import java.util.Scanner;

public class Task35 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

         double v = sc.nextDouble();
         double u = sc.nextDouble();
         double t1 = sc.nextDouble();
         double t2 = sc.nextDouble();

         double s = t1 * v;
         s = s + (t2 * (v - u));

        System.out.println(s);
    }
}
