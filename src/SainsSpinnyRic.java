public class SainsSpinnyRic extends Food {

    protected void initNutrition() {
        this.fatPer100 = 3.3;
        this.satFatPer100 = 1.1;
        this.carbPer100 = 25.7;
        this.sugarPer100 = 1.4;
        this.proteinPer100 = 6.3;
        this.saltPer100 = 0.35;
        this.calsPer100 = 161;
    }

    public SainsSpinnyRic(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsSpinnyRic(double mass) {
        this(mass, 0);
    }
}
