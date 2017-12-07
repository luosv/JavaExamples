package design.pattern.builder;

/**
 * 步骤 6
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象
 * Created by luosv on 2017/12/7 0007.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
