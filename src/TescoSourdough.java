public class TescoSourdough extends Food {

    public TescoSourdough(double mass, double price) {
        super(mass, price);
    }

    
    public double getFatPer100Grams() {
        return 0.5;
    }

    
    public double getSatFatPer100Grams() {
        return 0.1;
    }

    
    public double getCarbPer100Grams() {
        return 48;
    }

    
    public double getSugarPer100Grams() {
        return 1.5;
    }

    
    public double getProteinPer100Grams() {
        return 10.7;
    }
    
    
    public double getSaltPer100Grams() {
        return 0.95;
    }

    
    public double getCalsPer100Grams() {
        return 245;
    }

}
