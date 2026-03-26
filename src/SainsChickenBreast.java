public class SainsChickenBreast extends Food {

    private double fatPer100 = 2.2;
    private double satFatPer100 = 0.4;
    private double carbPer100 = 0;
    private double sugarPer100 = 0;
    private double proteinPer100 = 30.6;
    private double saltPer100 = 0.14;
    private double calsPer100 = 142;
    private double price;
    private double mass;

    public SainsChickenBreast(double mass, double price) {
        super(mass, price);
    }

    public SainsChickenBreast(double price) {
        super(price);
    }
}
