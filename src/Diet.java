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

    private static List<Diet> listOfDiets = new ArrayList<Diet>();

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
        listOfDiets.add(this);
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

    private static void writeListOfDietsToReadme() {
        ReadmeWriter writer = new ReadmeWriter();
        for (Diet diet : Diet.listOfDiets) { // TODO: MOVE THIS LOOP INSIDE READMEWRITER, ALLOW PASSING LIST OR SINGLE DIET
            writer.writeDietToReadme(diet);
        }
    }

    public static void main(String[] args) {
        List<Food> listOfFoodsBulk = new ArrayList<Food>();
        listOfFoodsBulk.add(new SainsChickenBreast(400));
        listOfFoodsBulk.add(new CurrySauce(167));
        listOfFoodsBulk.add(new TescoSpinnyRic(300));
        listOfFoodsBulk.add(new SainsTomatoSauce(250));
        listOfFoodsBulk.add(new TescoSourdough(200));
        listOfFoodsBulk.add(new SainsPeanutButter(75));
        Diet dietBulk = new Diet("Bulk", listOfFoodsBulk);

        List<Food> listOfFoodsCut = new ArrayList<Food>();
        listOfFoodsCut.add(new SainsChickenBreast(400));
        listOfFoodsCut.add(new TescoSpinnyRic(300));
        listOfFoodsCut.add(new SainsTomatoSauce(250));
        listOfFoodsCut.add(new SainsPeanutButter(50));
        Diet dietCut = new Diet("Cut", listOfFoodsCut);

        List<Food> listOfFoodsCheat = new ArrayList<Food>();
        listOfFoodsCheat.add(new TescoSpinnyRic(300));
        listOfFoodsCheat.add(new SainsTomatoSauce(125));
        listOfFoodsCheat.add(new DQP());
        listOfFoodsCheat.add(new DQP());
        //Diet dietCheat = new Diet("Cheat", listOfFoodsCheat);
        
        List<Food> listOfFoodsTest = new ArrayList<Food>();
        listOfFoodsTest.add(new TescoSpinnyRic(300));
        listOfFoodsTest.add(new SainsChickenBreast(320));
        listOfFoodsTest.add(new SainsTomatoSauce(250));
        listOfFoodsTest.add(new TescoSourdough(200));
        listOfFoodsTest.add(new CremeEgg());
        //Diet dietTest = new Diet("Test", listOfFoodsTest);


        System.out.println(dietBulk);
        System.out.println(dietCut);
        //System.out.println(dietTest);
        //System.out.println(dietCheat);

        writeListOfDietsToReadme();
    }
}
