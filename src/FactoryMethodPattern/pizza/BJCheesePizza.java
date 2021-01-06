package FactoryMethodPattern.pizza;

public class BJCheesePizza  implements  pizza{

    @Override
    public void prepare() {
        System.out.println("北京的奶酪披萨准备好了");
    }
}
