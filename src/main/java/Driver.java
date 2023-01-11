import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<Fruit> fruits;
        FruitBowl fruitBowl = new FruitBowl();
        fruits= fruitBowl.fruitsInBowl();
        CommonUtilities commonUtilities = new CommonUtilities();
        commonUtilities.uniqueFruitsInBowl(fruits);
        commonUtilities.sortBySize(fruits);
    }

}
