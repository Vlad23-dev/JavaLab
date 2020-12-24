package Classes;

import org.apache.log4j.Logger;

public class Processor extends Component {
    private float clockFrequency;
    private int bitDepth;
    private float workTemparature;
    private int numCores;
    private static final Logger log = Logger.getLogger(Processor.class);

    public Processor(String model, Producers producer, float clckFrq, int bitDepth, float workTemparature, int numCores) {
        super(model, producer);
        this.clockFrequency = clckFrq;
        this.bitDepth = bitDepth;
        this.workTemparature = workTemparature;
        this.numCores = numCores;
    }
    @Override
    public void display() {
        log.info("Info about processor");
        super.display();
        log.info("Clock Frequency: " + this.getClockFrequency() + " GHz");
        log.info("Bit Depth: x" + this.getBitDepth());
        log.info("Work Temperature: " + this.getWorkTemparature() + "°C");
        log.info("Amount of cores: " + this.getNumCores() + "\n");
    }

    public float getClockFrequency() {
        return this.clockFrequency;
    }

    public void setClockFrequency(float clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getBitDepth() {
        return this.bitDepth;
    }

    public void setBitDepth(int bitDepth) {
        this.bitDepth = bitDepth;
    }

    public float getWorkTemparature() {
        return this.workTemparature;
    }

    public void setWorkTemparature(float workTemparature) {
        this.workTemparature = workTemparature;
    }

    public int getNumCores() {
        return this.numCores;
    }

    public void setNumCores(int numCores) {
        this.numCores = numCores;
    }
}