package Classes;

import Classes.Body;
import Classes.Producers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BodyTest {
    public Body b1;

    BodyTest() {
        this.b1 = new Body("Pardo White", Producers.DeepCool, 45.6F, 20.3F, 35.0F, "Plastic");
    }

    @Test
    public void testCreationBody() throws Exception {
        Assertions.assertNotNull(this.b1);
    }
}