import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task1 task1 = new Task1();

        Task1Solution expected = new Task1Solution(5, 285);
        int[] array = new int[] {37, 25, 77, 23, 5, 23, 243, 285};
        Assertions.assertEquals(expected, task1.run(8, array));

        expected = new Task1Solution(24, 5484);
        array = new int[] {4399, 273, 24, 3747, 4999, 5299, 5484};
        Assertions.assertEquals(expected, task1.run(7, array));

    }
}