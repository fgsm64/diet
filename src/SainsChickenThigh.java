public class SainsChickenThigh extends Food {

    protected void initNutrition() {
        this.fatPer100 = 7.6;
        this.satFatPer100 = 2.1;
        this.carbPer100 = 0;
        this.sugarPer100 = 0;
        this.proteinPer100 = 24.8;
        this.saltPer100 = 0.75;
        this.calsPer100 = 168;
    }

    public SainsChickenThigh(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsChickenThigh(double mass) {
        this(mass, 0);
    }
}
