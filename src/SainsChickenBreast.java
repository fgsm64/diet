public class SainsChickenBreast extends Food {

    private void initNutrition() {
        this.fatPer100 = 2.2;
        this.satFatPer100 = 0.4;
        this.carbPer100 = 0;
        this.sugarPer100 = 0;
        this.proteinPer100 = 30.6;
        this.saltPer100 = 0.14;
        this.calsPer100 = 142;
    }

    public SainsChickenBreast(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsChickenBreast(double mass) {
        this(mass, 0);
    }
}
