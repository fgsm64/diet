public class SainsPeanutButter extends Food {

    protected void initNutrition() {
        this.fatPer100 = 50.9;
        this.satFatPer100 = 7;
        this.carbPer100 = 13.7;
        this.sugarPer100 = 7;
        this.proteinPer100 = 24.6;
        this.saltPer100 = 0.7;
        this.calsPer100 = 548;
    }

    public SainsPeanutButter(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsPeanutButter(double mass) {
        this(mass, 0);
    }
}
