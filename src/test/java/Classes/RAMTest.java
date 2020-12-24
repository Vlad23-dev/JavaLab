package Classes;

import Classes.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RAMTest {
    public RAM r1;

    RAMTest() {
        this.r1 = new RAM("HyperX Fury Black", Producers.HyperX, 8.0F, "RAM", "DDR3", 3200.0F);
    }

    @Test
    public void testCreationRAM() throws Exception {
        Assertions.assertNotNull(this.r1);
    }
}