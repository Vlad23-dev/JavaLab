package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HardDriveTest {
    public HardDrive hd1;

    HardDriveTest() {
        this.hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240.0F, "Hard Drive", "SSD", 500.0F, 350.0F);
    }

    @Test
    public void testCreationHardDrive() throws Exception {
        Assertions.assertNotNull(this.hd1);
    }
}
