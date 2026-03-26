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
        
        List<Food> listOfFoodsTest = new ArrayList<Food>();
        listOfFoodsTest.add(new SainsChickenBreast(320, 5.95));
        Diet dietTest = new Diet("Test", listOfFoodsTest);

        System.out.println(dietTest);

    }
}