import java.util.List;
import java.util.stream.Collectors;

public class CommonUtilities {
    //List<Fruit> fruits;
    List<String> fruitBySize;
    FruitBasket fruitBasket;
    List<String> fruitSize;

    public void uniqueFruitsInBowl (List<Fruit> fruits) {
        //this.fruits= fruits;
        fruitBySize=fruits.stream().map(i -> i.getSize()).distinct().collect(Collectors.toList());
    }


    public void sortBySize(List<Fruit> fruit) {
        for (String size : fruitBySize) {
            fruitBasket=new FruitBasket(size);
            fruitSize = fruit.stream()
                    .filter(f -> f.getSize().equalsIgnoreCase(size)).map(f -> f.getName()).collect(Collectors.toList());
            printFruitBasket(fruitSize,fruitBasket);
        }
    }


    public void printFruitBasket(List<String> fruitSize, FruitBasket fruitBasket ) {
        System.out.printf("Place %s in %s layer of basket%n", fruitSize,fruitBasket.getLayer());
    }
}
