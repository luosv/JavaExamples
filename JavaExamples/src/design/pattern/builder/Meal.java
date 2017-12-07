package design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤 5
 * 创建一个 Meal 类，带有上面定义的 Item 对象
 * Created by luosv on 2017/12/7 0007.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
