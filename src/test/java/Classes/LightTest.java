package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LightTest {
    public Light l1;

    LightTest() {
        this.l1 = new Light("Rgb lightning", Producers.DeepCool, 100.0F, "rgb");
    }

    @Test
    public void testCreationLight() throws Exception {
        Assertions.assertNotNull(this.l1);
    }
}