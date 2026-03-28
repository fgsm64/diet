public class CremeEgg extends Food {

    protected void initNutrition() {
        this.fatPer100 = 15;
        this.satFatPer100 = 8.9;
        this.carbPer100 = 72;
        this.sugarPer100 = 65;
        this.proteinPer100 = 3.1;
        this.saltPer100 = 0.15;
        this.calsPer100 = 441;
    }

    public CremeEgg(double mass, double price) {
        super(mass, price);
        initNutrition();
    }

    public CremeEgg(double mass) {
        this(mass, 0);
    }

    public CremeEgg() {
        this(40, 0);
    }
}
