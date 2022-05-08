import java.util.Scanner;

public class Task34 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double startChocolateKG = sc.nextDouble();
        double startChocolateMoney = sc.nextDouble();
        double startCandyKG = sc.nextDouble();
        double startCandyMoney = sc.nextDouble();

        double oneChocolateMoney = startChocolateMoney / startChocolateKG;
        double oneCandyMoney = startCandyMoney / startCandyKG;
        double difference = oneChocolateMoney / oneCandyMoney;

        System.out.println(oneChocolateMoney + " " + oneCandyMoney + " " + difference);
    }
}
