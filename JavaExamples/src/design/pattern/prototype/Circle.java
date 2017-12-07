package design.pattern.prototype;

/**
 * 步骤 2
 * 创建扩展了上面抽象类的实体类
 * Created by luosv on 2017/12/7 0007.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
