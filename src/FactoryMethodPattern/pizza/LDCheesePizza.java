package FactoryMethodPattern.pizza;

public class LDCheesePizza implements  pizza{
    @Override
    public void prepare() {
        System.out.println("伦敦的奶酪披萨准备好了");
    }
}
