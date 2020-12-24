package Classes;

import org.apache.log4j.Logger;

public class MotherBoard extends Component {
    private String chipSlot;
    private String chipSet;
    private Light rgbLight;
    protected MotherBoard.Slots slots;
    private static final Logger log = Logger.getLogger(MotherBoard.class);

    public MotherBoard(String model, Producers producer, String chipSlot, String chipSet, int amountRam, int amountPci, int amountSata, String modelLight, Producers producerLight, int power, String type) {
        super(model, producer);
        this.chipSlot = chipSlot;
        this.chipSet = chipSet;
        if (amountRam <= 0 || amountPci <= 0 || amountSata <= 0) {
            try {
                throw new HandleException.SlotsAmount("Invalid amount of slots", this);
            } catch (HandleException.SlotsAmount var16) {
                var16.printStackTrace();
            } finally {
                log.error("Error");
            }
        }

        this.slots = new Slots(amountRam, amountPci, amountSata);
        this.rgbLight = new Light(modelLight, producerLight, 100.0F, "rgb");
    }

    public MotherBoard(String model, Producers producer, String chipSlot, String chipSet, int amountRam, int amountPci, int amountSata) {
        super(model, producer);
        this.chipSlot = chipSlot;
        this.chipSet = chipSet;
        if (amountRam <= 0 || amountPci <= 0 || amountSata <= 0) {
            try {
                throw new HandleException.SlotsAmount("Invalid amount of slots", this);
            } catch (HandleException.SlotsAmount var12) {
                var12.printStackTrace();
            } finally {
                log.error("Error");
            }
        }

        this.slots = new Slots(amountRam, amountPci, amountSata);
    }
    @Override
    public void display() {
        log.info("Info about motherboard");
        super.display();
        log.info("Type of chip slot: " + this.getChipSlot());
        log.info("Type of chip set: " + this.getChipSlot());
        log.info("Info about motherboard`s slots");
        log.info("Amount RAM slots: " + this.getSlots().getAmountRAM());
        log.info("Amount PCI slots: " + this.getSlots().getAmountPCI());
        log.info("Amount SATA slots: " + this.getSlots().getAmountSATA() + "\n");
        if (this.getRgbLight() != null) {
            this.getRgbLight().display();
        }

    }

    public void createLight(String modelLight, Producers producerLight) {
        this.rgbLight = new Light(modelLight, producerLight, 100.0F, "rgb");
    }

    public void setChipSlot(String chipSlot) {
        this.chipSlot = chipSlot;
    }

    public String getChipSlot() {
        return this.chipSlot;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getChipSet() {
        return this.chipSet;
    }

    public MotherBoard.Slots getSlots() {
        return this.slots;
    }

    public Light getRgbLight() {
        return this.rgbLight;
    }

    public void setRgbLight(Light rgbLight) {
        this.rgbLight = rgbLight;
    }

    static class Slots {
        private int amountRAM;
        private int amountPCI;
        private int amountSATA;

        public Slots(int amountRam, int amountPci, int amountSata) {
            this.amountRAM = amountRam;
            this.amountPCI = amountPci;
            this.amountSATA = amountSata;
        }

        public int getAmountRAM() {
            return this.amountRAM;
        }

        public void setAmountRAM(int amountRAM) {
            this.amountRAM = amountRAM;
        }

        public int getAmountPCI() {
            return this.amountPCI;
        }

        public void setAmountPCI(int amountPCI) {
            this.amountPCI = amountPCI;
        }

        public int getAmountSATA() {
            return this.amountSATA;
        }

        public void setAmountSATA(int amountSATA) {
            this.amountSATA = amountSATA;
        }
    }
}
