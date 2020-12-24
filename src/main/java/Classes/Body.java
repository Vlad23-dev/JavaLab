package Classes;

import org.apache.log4j.Logger;

public class Body extends Component {
    private float height;
    private float width;
    private float length;
    private String material;
    private static final Logger log = Logger.getLogger(Body.class);

    public Body(String model, Producers producer, float h, float w, float l, String mat) {
        super(model, producer);
        this.height = h;
        this.width = w;
        this.length = l;
        this.material = mat;
    }
    @Override
    public void display() {
        log.info("Info about body");
        super.display();
        log.info("Height: " + this.getHeight() + " cm");
        log.info("Width: " + this.getWidth() + " cm");
        log.info("Length: " + this.getLength() + " cm");
        log.info("Material: " + this.getMaterial() + "\n");
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

