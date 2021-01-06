package FactoryMethodPattern.pizza;

public class LDPepperPizza   implements  pizza{
    @Override
    public void prepare() {
        System.out.println("伦敦的胡椒披萨准备好了");
    }
}
