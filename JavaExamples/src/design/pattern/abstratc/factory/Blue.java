package design.pattern.abstratc.factory;

/**
 * 4、创建实现接口的颜色实体类Blue
 * Created by luosv on 2017/12/5 0005.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
