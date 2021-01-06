package SimpleFactoryPattern;

public class Test {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        factory.createPizza("巧克力");
    }
}
