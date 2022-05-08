import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @Test
    void run() {

        Task23 task23 = new Task23();

        Assertions.assertEquals(7, task23.run(11220));
        Assertions.assertEquals(11, task23.run(15060));
        Assertions.assertEquals(0,task23.run(32400));
    }
}