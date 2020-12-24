package Classes;

import org.apache.log4j.Logger;

public class HardDrive extends Memory {
    private String typeHD;
    private float frequencyRead;
    private float frequencyRecord;
    private static final Logger log = Logger.getLogger(GraphicalProcessor.class);

    public HardDrive(String model, Producers producer, float capacity, String type, String typeHD, float frequencyRead, float frequencyRecord) {
        super(model, producer, capacity, type);
        this.typeHD = typeHD;
        this.frequencyRead = frequencyRead;
        this.frequencyRecord = frequencyRecord;
    }
    @Override
    public void display() {
        log.info("Info about HD");
        super.display();
        log.info("Type of RAM: " + this.getTypeHD());
        log.info("Frequency of reading: " + this.getFrequencyRead() + " MB/s");
        log.info("Frequency of recording: " + this.getFrequencyRecord() + " MB/s\n");
    }

    public String getTypeHD() {
        return this.typeHD;
    }

    public void setTypeRAM(String typeHD) {
        this.typeHD = typeHD;
    }

    public float getFrequencyRead() {
        return this.frequencyRead;
    }

    public void setFrequency(float frequencyRead) {
        this.frequencyRead = frequencyRead;
    }

    public float getFrequencyRecord() {
        return this.frequencyRecord;
    }

    public void setFrequencyRecord(float frequencyRecord) {
        this.frequencyRecord = frequencyRecord;
    }
}