package design.pattern.abstratc.factory;

/**
 * 6、创建扩展了 AbstractFactory 的工厂类 ColorFactory，基于给定的信息生成实体类的对象
 * Created by luosv on 2017/12/5 0005.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
