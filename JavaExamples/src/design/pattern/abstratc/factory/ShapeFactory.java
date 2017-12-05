package design.pattern.abstratc.factory;

/**
 * 6、创建扩展了 AbstractFactory 的工厂类 ShapeFactory，基于给定的信息生成实体类的对象
 * Created by luosv on 2017/12/5 0005.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
