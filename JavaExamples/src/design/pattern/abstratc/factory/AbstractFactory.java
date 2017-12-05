package design.pattern.abstratc.factory;

/**
 * 5、为 Color 和 Shape 对象创建抽象类来获取工厂
 * Created by luosv on 2017/12/5 0005.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
