package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryTest {
    public HardDrive hd1;

    MemoryTest() {
        this.hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240.0F, "Hard Drive", "SSD", 500.0F, 350.0F);
    }

    @Test
    public void testMemoryModelPresence() throws Exception {
        Assertions.assertNotNull(this.hd1.getModel());
        Assertions.assertEquals("Kingston SSDNow A400", this.hd1.getModel());
    }
}