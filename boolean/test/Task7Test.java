import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void run() {

        Task7 task7 = new Task7();

        assertFalse(task7.run(1, 5, 4));
        assertTrue(task7.run(1, 5, 9));
        assertTrue(task7.run(8, 4, 3));
    }
}