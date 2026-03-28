public class ProteinPowder extends Food {

    protected void initNutrition() {
        this.fatPer100 = 3.6;
        this.satFatPer100 = 2.8;
        this.carbPer100 = 28;
        this.sugarPer100 = 21;
        this.proteinPer100 = 59;
        this.saltPer100 = 0.8;
        this.calsPer100 = 376;
    }

    public ProteinPowder(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public ProteinPowder(double mass) {
        this(mass, 0);
    }
}
