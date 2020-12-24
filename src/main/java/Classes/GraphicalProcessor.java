package Classes;

import org.apache.log4j.Logger;

public class GraphicalProcessor extends Component {
    private float capacity;
    private String type;
    private float busWidth;
    private float frequency;
    private static final Logger log = Logger.getLogger(HardDrive.class);

    public GraphicalProcessor(String model, Producers producer, float capacity, String type, float busWidth, float frequency) {
        super(model, producer);
        this.capacity = capacity;
        this.type = type;
        this.busWidth = busWidth;
        this.frequency = frequency;
    }
    @Override
    public void display() {
        log.info("Info about graphical processor");
        super.display();
        log.info("Capacity of memory: " + this.getCapacity() + " GB");
        log.info("Type of memory: " + this.getType());
        log.info("Bus Width: " + this.getBusWidth() + " bit");
        log.info("Frequency: " + this.getFrequency() + " Mhz\n");
    }

    public float getCapacity() {
        return this.capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBusWidth() {
        return this.busWidth;
    }

    public void setBusWidth(float busWidth) {
        this.busWidth = busWidth;
    }

    public float getFrequency() {
        return this.frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getDivided(float a, float b) {
        Calculate obj = new Calculate();
        return obj.getCapacityDividedFrequency(a, b);
    }
}