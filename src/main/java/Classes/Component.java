package Classes;

import org.apache.log4j.Logger;

abstract class Component {
    private String model;
    private Producers producer;
    protected static final Logger log = Logger.getLogger(Component.class);

    protected Component(String model, Producers producer) {
        this.model = model;
        this.producer = producer;
    }

    public void display() {
        log.info("Model: " + this.getModel());
        log.info(this.getProducer());
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Producers getProducer() {
        return this.producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

}