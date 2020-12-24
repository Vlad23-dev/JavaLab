package Classes;

import Classes.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompatibileTest {
    CompatibileTest() {
    }

    @Test
    public void testCompababilitySystemBlock() throws Exception {
        MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155", "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool, 100, "rgb");
        Processor p1 = new Processor("Intel Core i5-9400F", Producers.Intel, 2.9F, 64, 50.0F, 6);
        ArrayList<RAM> set = new ArrayList();
        RAM r1 = new RAM("HyperX Fury Black", Producers.HyperX, 8.0F, "RAM", "DDR3", 3200.0F);

        for(int i = 0; i < 5; ++i) {
            set.add(r1);
        }

        HardDrive hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240.0F, "Hard Drive", "SSD", 500.0F, 350.0F);
        PowerUnit pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600.0F, "Ventilators", 6);
        GraphicalProcessor gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4.0F, "GDDR5", 128.0F, 7.0F);
        Body b1 = new Body("Pardo White", Producers.DeepCool, 45.6F, 20.3F, 35.0F, "Plastic");
        SystemBlock dream = new SystemBlock(m1, p1, hd1, gp1, pu1, set, b1);
        Assertions.assertTrue(dream.testCompatibility(5, dream.getRAMs().size()));
    }
}