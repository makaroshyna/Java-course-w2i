import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task116Test {

    @Test
    void run() {
        Task116 task116 = new Task116();

        int[] input = new int[] {4, 5, 5, 5, 5, 5, 2, 2, 4, 4, 4, 6};
        int[] x = new int[] {1, 5, 2, 3, 1};
        int[] y = new int[] {4, 5, 2, 4, 6};
        Task116Solution actual = new Task116Solution(x, y);
        Assertions.assertEquals(actual, task116.run(input, 12));

        input = new int[] {9, 9, 9, 9, 1, 3, 3, 3, 2, 2, 6, 6, 6};
        x = new int[] {4, 1, 3, 2, 3};
        y = new int[] {9, 1, 3, 2, 6};
        actual = new Task116Solution(x, y);
        Assertions.assertEquals(actual, task116.run(input, 13));
    }
}