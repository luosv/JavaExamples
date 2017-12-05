package design.pattern.factory;

/**
 * 2、创建实现接口的实体类Square
 * Created by luosv on 2017/12/5 0005.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
