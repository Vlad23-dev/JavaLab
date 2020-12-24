package Classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MotherBoardTest {
    public MotherBoard m1;
    public MotherBoard m2;

    MotherBoardTest() {
        this.m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155", "P67", 4, 3, 8, "LightYourFate", Producers.DeepCool, 100, "rgb");
        this.m2 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155", "P67", 4, 3, 8);
    }

    @Test
    public void testCreationMotherboard() throws Exception {
        Assertions.assertNotNull(this.m1);
    }

    @Test
    public void testCreationMotherboardWithoutLight() throws Exception {
        Assertions.assertNotNull(this.m2);
    }

    @Test
    public void testMotherBoardCreateLight() throws Exception {
        this.m2.createLight("LightYourFate", Producers.DeepCool);
        Assertions.assertNotNull(this.m2.getRgbLight());
    }

    @Test
    public void testMotherBoardSlotsAmountException() throws Exception {
        try {
            MotherBoard m1 = new MotherBoard("LGA1155 P8P67 PRO", Producers.ASUS, "LGA1155", "P67", -4, 3, 8, "LightYourFate", Producers.DeepCool, 100, "rgb");
            throw new HandleException.SlotsAmount("Invalid amount of slots", m1);
        } catch (HandleException.SlotsAmount var2) {
            Assertions.assertEquals("Invalid amount of slots", var2.getMessage());
        }
    }
}