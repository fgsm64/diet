public class CremeEgg extends Food {

    public CremeEgg(double mass, double price) {
        super(mass, price);
    }

    public CremeEgg(double price) {
        super(40, price);
    }

    public CremeEgg() {
        super(40, 0);
    }

    public double getFatPer100Grams() {
        return 15;
    }

    
    public double getSatFatPer100Grams() {
        return 8.9;
    }

    
    public double getCarbPer100Grams() {
        return 72;
    }

    
    public double getSugarPer100Grams() {
        return 65;
    }

    
    public double getProteinPer100Grams() {
        return 3.1;
    }
    
    
    public double getSaltPer100Grams() {
        return 0.15;
    }


    public double getCalsPer100Grams() {
        return 441;
    }

}
