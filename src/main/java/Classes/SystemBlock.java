package Classes;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class SystemBlock implements Compatible {
    private MotherBoard motherboard;
    private Processor processor;
    private HardDrive hardDrive;
    private GraphicalProcessor graphicalProcessor;
    private PowerUnit powerUnit;
    private Body body;
    ArrayList<RAM> setRam;
    private static final Logger log = Logger.getLogger(SystemBlock.class);

    public SystemBlock(MotherBoard mb, Processor pr, HardDrive hd, GraphicalProcessor gp, PowerUnit pw, ArrayList<RAM> set, Body bd) {
        this.motherboard = mb;
        this.processor = pr;
        this.hardDrive = hd;
        this.graphicalProcessor = gp;
        this.powerUnit = pw;
        this.body = bd;
        this.setRam = set;
    }

    public SystemBlock() {
    }

    public void display() {
        log.info("Info about system block\n");
        this.getMb().display();
        this.getPr().display();
        this.getHd().display();
        this.getGp().display();
        this.getPw().display();
        if (this.testCompatibility(this.getMb().getSlots().getAmountRAM(), this.getRAMs().size())) {
            for (RAM ram : this.getRAMs()) {
                ram.display();
            }
        } else {
            log.error("Quantity of RAM boards inserted are bigger than motherboard can hold!\n");
        }

        this.getBd().display();
    }

    public double averageRAM() throws HandleException.EmptyReturn {
        return this.getRAMs().stream()
                .mapToDouble(RAM::getFrequency)
                .average()
                .orElseThrow(() -> new HandleException.EmptyReturn("RAM slots are empty."));

    }

    public List<RAM> getRAMsByType(String typeMemory){
        return setRam.stream()
                .filter(a -> a.getTypeRAM().equals(typeMemory))
                .collect(Collectors.toList());
    }

    public double sumRAMFrequencyByType(String typeMemory){
        return setRam.stream()
                .filter(a -> a.getTypeRAM().equals(typeMemory))
                .mapToDouble(RAM::getFrequency)
                .sum();
    }

    public RAM getMaxRAM() throws HandleException.EmptyReturn {
        return this.getRAMs().stream()
                .max(Comparator.comparing(RAM::getFrequency))
                .orElseThrow(() -> new HandleException.EmptyReturn("RAM slots are empty."));
    }

    public Map<Boolean, List<RAM>> groupRAMbyProducer(Producers producer){
        Map<Boolean, List<RAM>> listRAM = setRam.stream()
                .collect(Collectors.partitioningBy(a -> a.getProducer() == producer));

        listRAM.forEach((k,v)->log.info("Key - " + k + ":  " +
                v.stream().map(RAM::getTypeRAM).collect(Collectors.joining(","))));

        return listRAM;
    }

    public MotherBoard getMb() {
        return this.motherboard;
    }

    public void setMb(MotherBoard mb) {
        this.motherboard = mb;
    }

    public Body getBd() {
        return this.body;
    }

    public void setBd(Body mb) {
        this.body = mb;
    }

    public Processor getPr() {
        return this.processor;
    }

    public void setPr(Processor pr) {
        this.processor = pr;
    }

    public HardDrive getHd() {
        return this.hardDrive;
    }

    public void setHd(HardDrive hd) {
        this.hardDrive = hd;
    }

    public GraphicalProcessor getGp() {
        return this.graphicalProcessor;
    }

    public void setGp(GraphicalProcessor gp) {
        this.graphicalProcessor = gp;
    }

    public PowerUnit getPw() {
        return this.powerUnit;
    }

    public void setPw(PowerUnit pw) {
        this.powerUnit = pw;
    }

    public ArrayList<RAM> getRAMs() {
        return this.setRam;
    }

    public void setRAMs(ArrayList<RAM> rams) {
        this.setRam = rams;
    }

    public boolean testCompatibility(int quantityGet, int quantityInsert) {
        return quantityGet >= quantityInsert;
    }
}
