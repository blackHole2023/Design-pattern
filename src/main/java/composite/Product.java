package composite;

import java.util.*;

interface Component {
    double getPrice();
}

/**
 * 实现了一个带有获取价格的接口，优势在哪呢
 *
 * 在未实现组合模式的代码中，我们直接将商品对象存储在购物车对象中，计算购物车总价时需要遍历购物车中所有商品对象，将每个商品对象的价格相加。
 *
 * 在实现组合模式的代码中，我们定义了一个 Component 接口，让商品对象和购物车对象都实现该接口，使得它们能够被统一处理。在购物车对象中，
 * 我们将商品对象存储在一个组件列表中，不论是商品对象还是购物车对象，它们都是组件，都具有一个获取价格的方法，因此计算购物车总价时只需要遍历组件列表，
 * 将每个组件的价格相加即可。
 *
 * 通过实现组合模式，我们可以将单个对象和组合对象都看作是组件，使得它们具有了统一的接口，能够被一致地处理，从而简化了代码。
 */
public class Product implements Component {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
class ShoppingCart implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        //遍历组件
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}

class Main{
    public static void main(String[] args) {

    }
}
