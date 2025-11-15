public abstract class Food {
    
    public double fat;
    public double satFat;
    public double carb;
    public double sugar;
    public double protein;
    public double salt;
    public double cals;
    public double price;
    public double mass;

    protected abstract double getFatPer100Grams();
    protected abstract double getSatFatPer100Grams();
    protected abstract double getCarbPer100Grams();
    protected abstract double getSugarPer100Grams();
    protected abstract double getSaltPer100Grams();
    protected abstract double getProteinPer100Grams();
    protected abstract double getCalsPer100Grams();

    public Food(double mass, double price) {
        this.mass = mass;
        mass /= 100;
        this.fat = getFatPer100Grams() * mass;
        this.satFat = getSatFatPer100Grams() * mass;
        this.carb = getCarbPer100Grams() * mass;
        this.sugar = getSugarPer100Grams() * mass;
        this.protein = getProteinPer100Grams() * mass;
        this.salt = getSaltPer100Grams() * mass;
        this.cals = getCalsPer100Grams() * mass;
        this.price = price;
    }

    public Food(double price) {
        this.fat = getFatPer100Grams();
        this.satFat = getSatFatPer100Grams();
        this.carb = getCarbPer100Grams();
        this.sugar = getSugarPer100Grams();
        this.protein = getProteinPer100Grams();
        this.salt = getSaltPer100Grams();
        this.cals = getCalsPer100Grams();
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName() + ", " + mass + "g, £" + price;
    }

}
