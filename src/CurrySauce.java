public class CurrySauce extends Food {

    protected void initNutrition() {
        this.fatPer100 = 3.2;
        this.satFatPer100 = 1;
        this.carbPer100 = 8.3;
        this.sugarPer100 = 4.4;
        this.proteinPer100 = 1.6;
        this.saltPer100 = 0.62;
        this.calsPer100 = 71;
    }

    public CurrySauce(double mass, double price) {
        super(mass, price);
        initNutrition();
    }
    public CurrySauce(double mass) {
        this(mass, 0);
    }
}
