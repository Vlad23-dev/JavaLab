package Classes;

import org.apache.log4j.Logger;

public class PowerUnit extends Component {
    private float power;
    private String cooling;
    private int plugs;
    private static final Logger log = Logger.getLogger(PowerUnit.class);

    public PowerUnit(String model, Producers producer, float power, String cooling, int plugs) {
        super(model, producer);
        this.power = power;
        this.cooling = cooling;
        this.plugs = plugs;
    }
    @Override
    public void display() {
        log.info("Info about power unit");
        super.display();
        log.info("Power: " + this.getPower() + "Wt");
        log.info("Cooling: " + this.getCooling());
        log.info("Plugs for all devices: " + this.getPlugs() + "\n");
    }

    public float getPower() {
        return this.power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getCooling() {
        return this.cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public int getPlugs() {
        return this.plugs;
    }

    public void setPlugs(int plugs) {
        this.plugs = plugs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            PowerUnit objCast = (PowerUnit)obj;
            return objCast.getPower() == this.getPower() && objCast.getPlugs() == this.getPlugs() && objCast.getCooling().equals(this.getCooling());
        } else {
            return false;
        }
    }
}