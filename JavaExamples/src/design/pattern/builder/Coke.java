package design.pattern.builder;

/**
 * 步骤 4
 * 创建扩展了 Burger 和 ColdDrink 的实体类
 * Created by luosv on 2017/12/7 0007.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
