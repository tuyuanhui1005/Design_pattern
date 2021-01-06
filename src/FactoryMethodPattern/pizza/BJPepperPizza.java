package FactoryMethodPattern.pizza;

public class BJPepperPizza implements pizza {
    @Override
    public void prepare() {
        System.out.println("北京的胡椒披萨准备好了");
    }
}
