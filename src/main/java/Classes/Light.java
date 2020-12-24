package Classes;

import org.apache.log4j.Logger;

public class Light extends Component {
    private float power;
    private String type;
    private static final Logger log = Logger.getLogger(Light.class);

    public Light(String model, Producers producer, float power, String type) {
        super(model, producer);
        this.power = power;
        this.type = type;
    }
    @Override
    public void display() {
        super.display();
        log.info("Power of light: " + this.getPower());
        log.info("Type of light: " + this.getType() + "\n");
    }

    public float getPower() {
        return this.power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}