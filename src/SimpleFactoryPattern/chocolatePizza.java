package SimpleFactoryPattern;

public class chocolatePizza  implements  pizza{

    @Override
    public void getPizza() {
        System.out.println("获得了巧克力披萨。。。。。。");
    }

    public chocolatePizza() {
        getPizza();
    }
}
