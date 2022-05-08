import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task1 task1 = new Task1();

        int[] actual = new int[] {14, 25, 2, 35, 25, 3, 8, 34, 89, 25};
        Assertions.assertEquals(260, task1.run(actual));

        actual = new int[] {36, 79, 25, 97, 24, 899, 234, 46, 234, 261};
        Assertions.assertEquals(1935, task1.run(actual));
    }
}