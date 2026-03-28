public class TescoSpinnyRic extends Food {

    protected void initNutrition() {
        this.fatPer100 = 4.2;
        this.satFatPer100 = 2.2;
        this.carbPer100 = 29;
        this.sugarPer100 = 1.2;
        this.proteinPer100 = 7.4;
        this.saltPer100 = 0.58;
        this.calsPer100 = 189;
    }

    public TescoSpinnyRic(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public TescoSpinnyRic(double mass) {
        this(mass, 0);
    }
}
