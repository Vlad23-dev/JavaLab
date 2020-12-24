package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProcessorTest {
    public Processor p1;

    ProcessorTest() {
        this.p1 = new Processor("Intel Core i5-9400F", Producers.Intel, 2.9F, 64, 50.0F, 6);
    }

    @Test
    public void testCreationProcessor() throws Exception {
        Assertions.assertNotNull(this.p1);
    }
}
