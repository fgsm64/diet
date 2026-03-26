import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Diet {
    
    private String name;
    private double fat = 0;
    private double satFat = 0;
    private double carb = 0;
    private double sugar = 0;
    private double protein = 0;
    private double salt = 0;
    private double cals = 0;
    private double price = 0;
    private List<Food> listOfFoods;

    public Diet(String name, List<Food> listOfFoods) {
        this.name = name;
        this.listOfFoods = listOfFoods;
        for (Food food : listOfFoods) {
            this.fat += food.getFat();
            this.satFat += food.getSatFat();
            this.carb += food.getCarb();
            this.sugar += food.getSugar();
            this.protein += food.getProtein();
            this.salt += food.getSalt();
            this.cals += food.getCals();
            this.price += food.getPrice();
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

        sb.append("# ").append(this.name).append(":  \n");

        sb.append("Fat: ").append((int)this.fat).append("g  \n");
        sb.append("SatFat: ").append((int)this.satFat).append("g  \n");
        sb.append("Carb: ").append((int)this.carb).append("g  \n");
        sb.append("Sugar: ").append((int)this.sugar).append("g  \n");
        sb.append("Protein: ").append((int)this.protein).append("g  \n"); 
        sb.append("Salt: ").append(String.format("%.2f", this.salt)).append("g; Sodium: ").append(String.format("%.2f", this.salt * 0.4)).append("g  \n");
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
        listOfFoodsBulk.add(new SainsChickenThigh(640, 5.95));
        listOfFoodsBulk.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsBulk.add(new TescoTomatoSauce(250, 0.37));
        listOfFoodsBulk.add(new TescoSourdough(200, 1.35));
        Diet dietBulk = new Diet("Bulk", listOfFoodsBulk);

        List<Food> listOfFoodsCut = new ArrayList<Food>();
        listOfFoodsCut.add(new SainsChickenBreast(400, 3));
        listOfFoodsCut.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCut.add(new TescoTomatoSauce(250, 0.38));
        listOfFoodsCut.add(new SainsPeanutButter(50, 0));
        Diet dietCut = new Diet("Cut", listOfFoodsCut);
        
        List<Food> listOfFoodsCheat = new ArrayList<Food>();
        listOfFoodsCheat.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsCheat.add(new TescoTomatoSauce(125, 0.38));
        listOfFoodsCheat.add(new DQP(5));
        listOfFoodsCheat.add(new DQP(5));
        Diet dietCheat = new Diet("Cheat", listOfFoodsCheat);
        
        List<Food> listOfFoodsTest = new ArrayList<Food>();
        listOfFoodsTest.add(new TescoSpinnyRic(300, 1.55));
        listOfFoodsTest.add(new SainsChickenBreast(320, 5.95));
        listOfFoodsTest.add(new TescoTomatoSauce(250, 0.37));
        listOfFoodsTest.add(new TescoSourdough(200, 1.35));
        listOfFoodsTest.add(new CremeEgg());
        Diet dietTest = new Diet("Test", listOfFoodsTest);


        System.out.println(dietBulk);
        System.out.println(dietTest);
        System.out.println(dietCut);
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