package Classes;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SystemBlockTest {
    public MotherBoard m1;
    public Processor p1;
    public ArrayList<RAM> set;
    public RAM r1;
    public HardDrive hd1;
    public PowerUnit pu1;
    public GraphicalProcessor gp1;
    public Body b1;
    public SystemBlock testBlock;

    SystemBlockTest() {
        this.m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155", "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool, 100, "rgb");
        this.p1 = new Processor("Intel Core i5-9400F", Producers.Intel, 2.9F, 64, 50.0F, 6);
        this.set = new ArrayList<RAM>();
        this.r1 = new RAM("HyperX Fury Black", Producers.HyperX, 8.0F, "RAM", "DDR3", 3200.0F);
        for(int i = 0; i < 5; ++i) {
            set.add(r1);
        }
        this.hd1 = new HardDrive("Kingston SSDNow A400", Producers.Kingston, 240.0F, "Hard Drive", "SSD", 500.0F, 350.0F);
        this.pu1 = new PowerUnit("DE600 v2", Producers.DeepCool, 600.0F, "Ventilators", 6);
        this.gp1 = new GraphicalProcessor("GeForce GTX 1050 Ti", Producers.MSI, 4.0F, "GDDR5", 128.0F, 7.0F);
        this.b1 = new Body("Pardo White", Producers.DeepCool, 45.6F, 20.3F, 35.0F, "Plastic");
        this.testBlock = new SystemBlock(this.m1, this.p1, this.hd1, this.gp1, this.pu1, this.set, this.b1);
    }

    @Test
    public void testCreationSystemBlock() throws Exception {
        for(int i = 0; i < 4; ++i) {
            this.set.add(this.r1);
        }

        Assertions.assertNotNull(this.testBlock);
    }

    @Test
    public void testFindAverageRAM() throws HandleException.EmptyReturn {
        Assertions.assertEquals(3200.0, this.testBlock.averageRAM());
    }

    @Test
    public void testGetRAMbyType() {
        Assertions.assertEquals(5, this.testBlock.getRAMsByType("DDR3").size());
        Assertions.assertEquals(0, this.testBlock.getRAMsByType("DDR4").size());
    }

    @Test
    public void testSumRAMFrequencyByType(){
        Assertions.assertEquals(16000, this.testBlock.sumRAMFrequencyByType("DDR3"));
        Assertions.assertEquals(0, this.testBlock.sumRAMFrequencyByType("DDR4"));
    }

    @Test
    public void testGetMaxRAM() throws HandleException.EmptyReturn {
        Assertions.assertEquals(this.testBlock.getRAMs().get(1), this.testBlock.getMaxRAM());
    }

    @Test
    public void testGroupRAMbyProducer(){
        Assertions.assertEquals(this.testBlock.getRAMs(), this.testBlock.groupRAMbyProducer(Producers.HyperX).get(true));
        Assertions.assertEquals(new ArrayList<RAM>(), this.testBlock.groupRAMbyProducer(Producers.HyperX).get(false));
    }
}