public class PilauRice extends Food {

    protected void initNutrition() {
        this.fatPer100 = 1.7;
        this.satFatPer100 = 0.2;
        this.carbPer100 = 29;
        this.sugarPer100 = 0.5;
        this.proteinPer100 = 2.5;
        this.saltPer100 = 0.38;
        this.calsPer100 = 146;
    }

    public PilauRice(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public PilauRice(double mass) {
        this(mass, 0);
    }
}
