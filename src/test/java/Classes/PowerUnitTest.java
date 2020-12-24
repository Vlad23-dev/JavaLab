package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerUnitTest {
    public PowerUnit pu1;

    PowerUnitTest() {
        this.pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600.0F, "Ventilators", 6);
    }

    @Test
    public void testCreationPowerUnit() throws Exception {
        Assertions.assertNotNull(this.pu1);
    }

    @Test
    public void testObjectEquation() throws Exception {
        PowerUnit pu2 = new PowerUnit("DE600 v2", Producers.DeepCool, 600.0F, "Ventilators", 6);
        Assertions.assertEquals(this.pu1, pu2);
    }

    @Test
    public void testObjectEquationFalse() throws Exception {
        PowerUnit pu2 = new PowerUnit("DE600 v2", Producers.DeepCool, 6000.0F, "Ventilators", 6);
        Assertions.assertNotEquals(this.pu1, pu2);
    }
}