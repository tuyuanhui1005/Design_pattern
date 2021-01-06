package SimpleFactoryPattern;

/**
 * 简单工厂模式 也叫静态工厂模式
 */
public class SimpleFactory {

    public pizza createPizza(String type) {
        pizza pizza = null;
        switch (type) {
            case "水果":
                pizza = new fruitPizza();
                break;
            case "巧克力":
                pizza = new chocolatePizza();
        }
        return  pizza;
    }
}
