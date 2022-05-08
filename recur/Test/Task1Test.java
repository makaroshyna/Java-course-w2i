import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void fact() {
        Task1 task1 = new Task1();

        Assertions.assertEquals(6, task1.fact(3));
        Assertions.assertEquals(5040, task1.fact(7));
    }
}