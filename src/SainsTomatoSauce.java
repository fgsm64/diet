public class SainsTomatoSauce extends Food {

    protected void initNutrition() {
        this.fatPer100 = 0;
        this.satFatPer100 = 0;
        this.carbPer100 = 9.3;
        this.sugarPer100 = 6.7;
        this.proteinPer100 = 1.6;
        this.saltPer100 = 0.61;
        this.calsPer100 = 49;
    }

    public SainsTomatoSauce(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public SainsTomatoSauce(double mass) {
        this(mass, 0);
    }
}
