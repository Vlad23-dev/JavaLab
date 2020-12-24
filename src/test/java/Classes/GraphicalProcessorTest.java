package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphicalProcessorTest {
    public GraphicalProcessor gp1;

    GraphicalProcessorTest() {
        this.gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4.0F, "GDDR5", 128.0F, 7.0F);
    }

    @Test
    public void testCreationGraphicalProcessor() throws Exception {
        Assertions.assertNotNull(this.gp1);
    }
}