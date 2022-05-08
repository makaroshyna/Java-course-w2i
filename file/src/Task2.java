import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        File task2File = new File("/home/katya/study/java/file/src/task2.txt");
        FileOutputStream fos1 = new FileOutputStream(task2File);

        int evenNumber = 2;
        for (int i = 0; i < n; i++) {
            fos1.write(String.valueOf(evenNumber).getBytes());
            evenNumber = evenNumber + 2;
        }

        fos1.close();
    }
}
