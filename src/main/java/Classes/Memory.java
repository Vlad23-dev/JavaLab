package Classes;

import org.apache.log4j.Logger;

class Memory extends Component {
    private String type;
    private float capacity;
    private static final Logger log = Logger.getLogger(Memory.class);

    public Memory(String model, Producers producer, float capacity, String type) {
        super(model, producer);
        this.type = type;
        this.capacity = capacity;
    }
    @Override
    public void display() {
        super.display();
        log.info("Capacity: " + this.getCapacity() + " GB");
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
}