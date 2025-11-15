import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Diet {
    
    public String name;
    public double fat = 0;
    public double satFat = 0;
    public double carb = 0;
    public double sugar = 0;
    public double protein = 0;
    public double salt = 0;
    public double cals = 0;
    public double price = 0;
    public List<Food> listOfFoods;

    public Diet(String name,List<Food> listOfFoods) {
        this.name = name;
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

        StringBuilder sb = new StringBuilder();

        sb.append(this.name).append(":  \n");

        sb.append("Fat: ").append((int)this.fat).append("g  \n");
        sb.append("SatFat: ").append((int)this.satFat).append("g  \n");
        sb.append("Carb: ").append((int)this.carb).append("g  \n");
        sb.append("Sugar: ").append((int)this.sugar).append("g  \n");
        sb.append("Protein: ").append((int)this.protein).append("g  \n"); 
        sb.append("Salt: ").append(this.salt).append("g; Sodium: ").append(this.salt * 0.4).append("g  \n");
        sb.append("Cals: ").append((int)this.cals).append("kcal  \n");
        sb.append("Price: £").append(String.format("%.2f", this.price)).append("  \n");
        sb.append(getMacroRatios());

        sb.append("\nFoods:\n");
        for (Food food : listOfFoods) {
            sb.append("  - ").append(food.toString()).append("\n");
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        List<Food> listOfFoodsBulk = new ArrayList<Food>();
        listOfFoodsBulk.add(new SainsChickenThigh(640, 5.5));
        listOfFoodsBulk.add(new TescoSpinnyRic(600, 3.10));
        listOfFoodsBulk.add(new TescoTomatoSauce(250, 0.38));
        Diet dietBulk = new Diet("Bulk", listOfFoodsBulk);

        List<Food> listOfFoodsTest = new ArrayList<Food>();
        listOfFoodsTest.add(new SainsChickenThigh(640, 5.5));
        listOfFoodsTest.add(new SainsSpinnyRic(600, 3.10));
        listOfFoodsTest.add(new SainsTomatoSauce(250, 0.38));
        Diet dietTest = new Diet("Test", listOfFoodsTest);

        List<Food> listOfFoodsCut = new ArrayList<Food>();
        listOfFoodsCut.add(new SainsChickenBreast(400, 3));
        //listOfFoodsCut.add(new SainsPeanutButter(100, 0.60));
        listOfFoodsCut.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCut.add(new TescoTomatoSauce(250, 0.38));
        Diet dietCut = new Diet("Cut", listOfFoodsCut);

        List<Food> listOfFoodsCheat = new ArrayList<Food>();
        listOfFoodsCheat.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCheat.add(new TescoTomatoSauce(125, 0.38));
        listOfFoodsCheat.add(new DQP(5));
        listOfFoodsCheat.add(new DQP(5));
        Diet dietCheat = new Diet("Cheat", listOfFoodsCheat);

        System.out.println(dietBulk);
        System.out.println(dietTest);
        //System.out.println(dietCut);
        //System.out.println(dietCut);
        //System.out.println(dietCheat);

        try {
            ReadmeWriter.clearReadme();
            ReadmeWriter.writeDietToReadme(dietCut);
            ReadmeWriter.writeDietToReadme(dietBulk);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}