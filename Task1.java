import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


interface DrinkReceipt
{
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
interface DrinkPreparation
{
    Map<String, Integer> makeDrink();
}
interface Rating
{
    int getRating();
}
class Caffee implements DrinkReceipt, DrinkPreparation, Rating
{
    private String name;
    private int rating;
    private Map<String, Integer> ingredients = new HashMap<>();

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public Map<String, Integer> makeDrink()
    {
        addComponent("Water", 100);
        addComponent("Arabica",20);
        return ingredients;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount)
    {
        ingredients.put(componentName,componentCount);
        return this;
    }

    @Override
    public int getRating()
    {
        return rating;
    }

    public Map<String, Integer> getIngredients()
    {
        return ingredients;
    }
}
class Espresso extends Caffee
{
    public Espresso(String name, int rating)
    {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water",50);
        addComponent("Arabica",20);
        return getIngredients();
    }

}
class Cappuccino extends Caffee
{
    public Cappuccino(String name, int rating)
    {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink()
    {
        addComponent("Water",100);
        addComponent("Arabica",20);
        addComponent("Milk",50);
        return getIngredients();
    }

}


class MyUtils
{
    public Map<String, Double> averageRating(List<Caffee> coffees)
    {
        return coffees.stream().collect(Collectors.groupingBy(Caffee::getName,Collectors.averagingDouble(Caffee::getRating)));
    }
}

public class Task1 
{
    public static void main(String[] args)
    {
        List<Caffee> list = new ArrayList<>();
        list.add(new Espresso("Espresso", 8));
        list.add(new Cappuccino("Cappuccino", 10));
        list.add(new Espresso("Espresso", 10));
        list.add(new Cappuccino("Cappuccino", 6));
        list.add(new Caffee("Caffee", 6));

        MyUtils obj = new MyUtils();
        System.out.println(obj.averageRating(list));
    }
}
