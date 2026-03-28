public class TescoSourdough extends Food {

    protected void initNutrition() {
        this.fatPer100 = 0.5;
        this.satFatPer100 = 0.1;
        this.carbPer100 = 48;
        this.sugarPer100 = 1.5;
        this.proteinPer100 = 10.7;
        this.saltPer100 = 0.95;
        this.calsPer100 = 245;
    }

    public TescoSourdough(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public TescoSourdough(double mass) {
        this(mass, 0);
    }
}
