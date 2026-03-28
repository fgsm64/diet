public abstract class Food {
    
    protected double fatPer100;
    protected double satFatPer100;
    protected double carbPer100;
    protected double sugarPer100;
    protected double proteinPer100;
    protected double saltPer100;
    protected double calsPer100;
    protected double price;
    protected double mass;

    protected Food(double mass, double price) {
        this.mass = mass;
        this.price = price;
    }

    protected abstract void initNutrition();

    public double getFat() {
        return this.fatPer100 * (this.mass / 100);
    }

    public double getSatFat() {
        return this.satFatPer100 * (this.mass / 100);
    }

    public double getCarb() {
        return this.carbPer100 * (this.mass / 100);
    }

    public double getSugar() {
        return this.sugarPer100 * (this.mass / 100);
    }

    public double getSalt() {
        return this.saltPer100 * (this.mass / 100);
    }

    public double getProtein() {
        return this.proteinPer100 * (this.mass / 100);
    }

    public double getCals() {
        return this.calsPer100 * (this.mass / 100);
    }

    public double getMass() {
        return this.mass;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return getClass().getSimpleName() + ", " + (String.format("%.0f", mass)) + "g, £" + price;
    }
}
