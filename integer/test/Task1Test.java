import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void run() {

        Task1 task1 = new Task1();

        Assertions.assertEquals(0, task1.run(0));
        Assertions.assertEquals(0, task1.run(32));
        Assertions.assertEquals(1, task1.run(178));
        Assertions.assertEquals(2, task1.run(233));
        Assertions.assertEquals(348, task1.run(34879));
    }
}