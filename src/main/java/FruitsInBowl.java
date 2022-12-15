import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FruitsInBowl {

    public static void main(String[] args) throws IOException {
        Fruit fruit1 = new Fruit("Apple", "red", "Small");
        Fruit fruit2 = new Fruit("Apple", "red", "Medium");
        Fruit fruit3 = new Fruit("Mango", "yellow", "Big");
        Fruit fruit4 = new Fruit("Banana", "yellow", "Medium");
        Fruit fruit5 = new Fruit("Grapes", "purple", "small");

        List<Fruit> fruitBowl = new ArrayList<>();
        fruitBowl.add(fruit1);
        fruitBowl.add(fruit2);
        fruitBowl.add(fruit3);
        fruitBowl.add(fruit4);
        fruitBowl.add(fruit5);

        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.sortFruitsBySize(fruitBowl);
    }
}
