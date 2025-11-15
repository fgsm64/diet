public class ProteinPowder extends Food {

    public ProteinPowder(double mass, double price) {
        super(mass, price);
    }

    
    public double getFatPer100Grams() {
        return 3.6;
    }

    
    public double getSatFatPer100Grams() {
        return 2.8;
    }

    
    public double getCarbPer100Grams() {
        return 28;
    }

    
    public double getSugarPer100Grams() {
        return 21;
    }

    
    public double getProteinPer100Grams() {
        return 59;
    }

    
    public double getSaltPer100Grams() {
        return 0.8;
    }

    
    public double getCalsPer100Grams() {
        return 376;
    }

}
