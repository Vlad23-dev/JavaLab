package Classes;

import org.apache.log4j.Logger;

public class RAM extends Memory {
    private String typeRAM;
    private float frequency;
    private static final Logger log = Logger.getLogger(RAM.class);

    public RAM(String model, Producers producer, float capacity, String type, String typeRAM, float frequency) {
        super(model, producer, capacity, type);
        this.typeRAM = typeRAM;
        this.frequency = frequency;
    }
    @Override
    public void display() {
        log.info("Info about RAM");
        super.display();
        log.info("Type of RAM: " + this.getTypeRAM());
        log.info("Frequency: " + this.getFrequency() + " Mhz\n");
    }

    public String getTypeRAM() {
        return this.typeRAM;
    }

    public void setTypeRAM(String typeRAM) {
        this.typeRAM = typeRAM;
    }

    public float getFrequency() {
        return this.frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}
