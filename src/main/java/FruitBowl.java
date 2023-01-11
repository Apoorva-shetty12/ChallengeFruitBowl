import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FruitBowl {

    public List<Fruit> fruitsInBowl(){

        List<Fruit> fruitBowl = new ArrayList<>();
        fruitBowl.add(new Fruit("Apple", "red", "Small"));
        fruitBowl.add(new Fruit("Apple", "red", "Medium"));
        fruitBowl.add(new Fruit("Mango", "yellow", "Big"));
        fruitBowl.add(new Fruit("Banana", "yellow", "Medium"));
        fruitBowl.add(new Fruit("Grapes", "purple", "big"));

        return fruitBowl;

    }

}
