import java.util.ArrayList;
import java.util.List;

public class Diet {
    
    public double fat = 0;
    public double satFat = 0;
    public double carb = 0;
    public double sugar = 0;
    public double protein = 0;
    public double salt = 0;
    public double cals = 0;
    public double price = 0;
    public List<Food> listOfFoods;

    public Diet(List<Food> listOfFoods) {
        this.listOfFoods = listOfFoods;
        for ( Food food : listOfFoods ) {
            this.fat += food.fat;
            this.satFat += food.satFat;
            this.carb += food.carb;
            this.sugar += food.sugar;
            this.protein += food.protein;
            this.salt += food.salt;
            this.cals += food.cals;
            this.price += food.price;
        }
    }

    private String getMacroRatios() {
        double total = fat + carb + protein;
        double fatRatio = fat / total;
        double carbRatio = carb / total;
        double proteinRatio = protein / total;
        return "F: " + (int)(fatRatio*100) + "%\n" + 
               "C: " + (int)(carbRatio*100) + "%\n" + 
               "P: " + (int)(proteinRatio*100) + "%\n";
    }

    public String toString() {
        for (Food food : listOfFoods ) {
            System.out.println(food);
        }

        return "Fat: " + (int)this.fat + "g\n" + 
               "SatFat: " + (int)this.satFat + "g\n" + 
               "Carb: " + (int)this.carb + "g\n" + 
               "Sugar: " + (int)this.sugar + "g\n" + 
               "Protein: " + (int)this.protein + "g\n" + 
               "Salt: " + this.salt + "g; Sodium: " + (this.salt * 0.4) + "g\n" + 
               "Cals: " + (int)this.cals + "kcal\n" + 
               "Price: £" + String.format("%.2f", this.price) + "\n" + 
               getMacroRatios();
    }
    
    public static void main(String[] args) {
        List<Food> listOfFoodsBulk = new ArrayList<Food>();
        listOfFoodsBulk.add(new SainsChickenThigh(640, 5.5));
        listOfFoodsBulk.add(new TescoSpinnyRic(600, 3.10));
        listOfFoodsBulk.add(new TescoTomatoSauce(250, 0.38));
        Diet dietBulk = new Diet(listOfFoodsBulk);

        List<Food> listOfFoodsTest = new ArrayList<Food>();
        listOfFoodsTest.add(new SainsChickenThigh(640, 5.5));
        listOfFoodsTest.add(new SainsSpinnyRic(600, 3.10));
        listOfFoodsTest.add(new SainsTomatoSauce(250, 0.38));
        Diet dietTest = new Diet(listOfFoodsTest);

        List<Food> listOfFoodsCut = new ArrayList<Food>();
        listOfFoodsCut.add(new SainsChickenBreast(400, 3));
        //listOfFoodsCut.add(new SainsPeanutButter(100, 0.60));
        listOfFoodsCut.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCut.add(new TescoTomatoSauce(250, 0.38));
        Diet dietCut = new Diet(listOfFoodsCut);

        List<Food> listOfFoodsCheat = new ArrayList<Food>();
        listOfFoodsCheat.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCheat.add(new TescoTomatoSauce(125, 0.38));
        listOfFoodsCheat.add(new DQP(5));
        listOfFoodsCheat.add(new DQP(5));
        Diet dietCheat = new Diet(listOfFoodsCheat);

        System.out.println(dietBulk);
        System.out.println(dietTest);
        //System.out.println(dietCut);
        //System.out.println(dietCut);
        //System.out.println(dietCheat);
    }
}