public class DQP extends Food {
    // no info for per 100g. all info is per burger
    public DQP(double price) {
        super(price);
    }

    
    public double getFatPer100Grams() {
        return 44;
    }

    
    public double getSatFatPer100Grams() {
        return 20;
    }

    
    public double getCarbPer100Grams() {
        return 36;
    }

    
    public double getSugarPer100Grams() {
        return 11;
    }

    
    public double getProteinPer100Grams() {
        return 50;
    }

    
    public double getSaltPer100Grams() {
        return 2.8;
    }

    
    public double getCalsPer100Grams() {
        return 749;
    }

}
