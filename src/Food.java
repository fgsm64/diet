public abstract class Food {
    
    private double fatPer100;
    private double satFatPer100;
    private double carbPer100;
    private double sugarPer100;
    private double proteinPer100;
    private double saltPer100;
    private double calsPer100;
    private double price;
    private double mass;

    protected Food(double mass, double price) {
        this.mass = mass;
        this.price = price;
    }

    protected Food(double price) {
        this.price = price;
    }

    // TO CONSIDER: make get*Per100 private? remove even?
    public double getFatPer100Grams() {
        return this.fatPer100;
    }

    public double getFat() {
        return this.fatPer100 * (this.mass / 100);
    }

    public double getSatFatPer100Grams() {
        return this.satFatPer100;
    }

    public double getSatFat() {
        return this.satFatPer100 * (this.mass / 100);
    }

    public double getCarbPer100Grams() {
        return this.carbPer100;
    }

    public double getCarb() {
        return this.carbPer100 * (this.mass / 100);
    }

    public double getSugarPer100Grams() {
        return this.sugarPer100;
    }

    public double getSugar() {
        return this.sugarPer100 * (this.mass / 100);
    }

    public double getSaltPer100Grams() {
        return this.saltPer100;
    }

    public double getSalt() {
        return this.saltPer100 * (this.mass / 100);
    }

    public double getProteinPer100Grams() {
        return this.proteinPer100;
    }

    public double getProtein() {
        return this.proteinPer100 * (this.mass / 100);
    }

    public double getCalsPer100Grams() {
        return this.calsPer100;
    }

    public double getCals() {
        return this.calsPer100 * (this.mass / 100);
    }

    public String toString() {
        return getClass().getSimpleName() + ", " + (String.format("%.0f", mass)) + "g, £" + price;
    }
}
