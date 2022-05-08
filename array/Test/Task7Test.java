import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task7 task7 = new Task7();

        int[] array = new int[] {3, 2, 5, 10, 20, 40};
        Assertions.assertArrayEquals(array, task7.run(6, 3, 2));

        array = new int[] {8, 38, 46, 92, 184};
        Assertions.assertArrayEquals(array, task7.run(5, 8, 38));

        array = new int[] {148, 0, 148, 296};
        Assertions.assertArrayEquals(array, task7.run(4, 148, 0));
    }
}