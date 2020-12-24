package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComponentTest {
    public Body b1;

    ComponentTest() {
        this.b1 = new Body("Pardo White", Producers.DeepCool, 45.6F, 20.3F, 35.0F, "Plastic");
    }

    @Test
    public void testComponentPresence() throws Exception {
        Assertions.assertNotNull(this.b1.getModel());
        Assertions.assertEquals("Pardo White", this.b1.getModel());
    }
}