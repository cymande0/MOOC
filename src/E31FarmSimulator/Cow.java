package E31FarmSimulator;

import javax.print.attribute.standard.MediaSize;
import java.util.Random;

public class Cow implements Milkable, Alive {

    private final int UDDER_MIN = 15;
    private final int UDDER_MAX = 40;
    private final int MAX_PRODUCE = 20;
    private final int MIN_PRODUCE = 7;
    private String name;
    private int udderCapacity;
    private double milkAmount;
    private Random random = new Random();

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.udderCapacity = drawCapacityOfUdder();
        this.milkAmount = 0.0;
    }

    public Cow(String name){
        this.name = name;
        this.udderCapacity = drawCapacityOfUdder();
        this.milkAmount = 0.0;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.udderCapacity;
    }

    public double getAmount(){
        return this.milkAmount;
    }

    public String toString(){
        return this.name + " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    public int drawCapacityOfUdder(){
        return random.nextInt((UDDER_MAX - UDDER_MIN) + 1) + UDDER_MIN;
    }

    @Override
    public void liveHour(){
        this.milkAmount += (random.nextInt((MAX_PRODUCE - MIN_PRODUCE) + 1) + MIN_PRODUCE) / 10.0;
        if(this.milkAmount > this.udderCapacity){
            this.milkAmount = this.udderCapacity;
        }
    }

    @Override
    public double milk(){
        double milkTaken = milkAmount;
        milkAmount = 0.0;
        return milkTaken;
    }
}
