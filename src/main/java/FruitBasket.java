import java.util.ArrayList;
import java.util.List;

public class FruitBasket {
    List<Fruit> firstLayer = new ArrayList<>();
    List<Fruit> secondLayer = new ArrayList<>();
    List<Fruit> thirdLayer = new ArrayList<>();

    public void sortFruitsBySize(List<Fruit> fruitsBowl) {
        for (Fruit fruit : fruitsBowl) {
            if (fruit.size.equalsIgnoreCase("Small")) {
                firstLayer.add(fruit);
            } else if (fruit.size.equalsIgnoreCase("Big")) {
                thirdLayer.add(fruit);
            } else
                secondLayer.add(fruit);
        }
        printFruitBasket(firstLayer,1);
        printFruitBasket(secondLayer,2);
        printFruitBasket(thirdLayer,3);
    }

    public void printFruitBasket(List<Fruit> fruits, int layer) {
        System.out.println("Fruits in Basket sorted by Size in " +layer+ " are");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}
