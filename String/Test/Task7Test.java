import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @org.junit.jupiter.api.Test
    void run() {
        Task7 task7 = new Task7();

        String str = "First and last";
        int[] expected = {70, 116};

        Assertions.assertArrayEquals(expected, task7.run(str));
    }
}