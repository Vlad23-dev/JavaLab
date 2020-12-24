package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public enum Producers {
    DeepCool("China"),
    ASUS("Taiwan"),
    Intel("USA"),
    HyperX("USA"),
    Kingston("USA"),
    MSI("Taiwan");

    private String producerCountry;

    Producers(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getProducerCountry() {
        return this.producerCountry;
    }

    public void setProducer(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getSimilarProducers() {
        Producers[] prodCountries = values();
        StringBuilder result = new StringBuilder("Similar producers from country: ");

        for (Producers prodCountry : prodCountries) {
            if (this.getProducerCountry().compareTo(prodCountry.getProducerCountry()) == 0) {
                result.append(prodCountry.name()).append(" ");
            }
        }

        return result.toString();
    }

    public ArrayList<String> splitProducersCountry(String countries) {
        String[] var3 = countries.split(",");
        int var4 = var3.length;

        return new ArrayList<>(Arrays.asList(var3).subList(0, var4));
    }
    @Override
    public String toString() {
        String var10000 = this.name();
        return "Producer: " + var10000 + "\nProducer`s country: " + this.getProducerCountry();
    }
}
