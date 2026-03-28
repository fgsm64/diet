public class DQP extends Food {

    // no info for per 100g. all info is per burger
    protected void initNutrition() {
        this.fatPer100 = 44;
        this.satFatPer100 = 20;
        this.carbPer100 = 36;
        this.sugarPer100 = 11;
        this.proteinPer100 = 50;
        this.saltPer100 = 2.8;
        this.calsPer100 = 749;
    }

    public DQP() {
        super(100, 0);
        initNutrition();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", " + "£" + price;
    }
}
