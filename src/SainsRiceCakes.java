public class SainsRiceCakes extends Food {

    protected void initNutrition() {
        this.fatPer100 = 2.7;
        this.satFatPer100 = 0.7;
        this.carbPer100 = 82.3;
        this.sugarPer100 = 0.5;
        this.proteinPer100 = 8.5;
        this.saltPer100 = 0.3;
        this.calsPer100 = 394;
    }

    public SainsRiceCakes(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsRiceCakes(double mass) {
        this(mass, 0);
    }
}
