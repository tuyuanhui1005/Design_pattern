package SimpleFactoryPattern;

public class fruitPizza  implements  pizza {

    @Override
    public void getPizza() {
        System.out.println("获得了水果味披萨");
    }

    public fruitPizza() {
        getPizza();
    }
}
