package design.pattern.prototype;

/**
 * 步骤 2
 * 创建扩展了上面抽象类的实体类
 * Created by luosv on 2017/12/7 0007.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
