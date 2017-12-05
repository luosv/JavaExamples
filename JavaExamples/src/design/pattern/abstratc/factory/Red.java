package design.pattern.abstratc.factory;

/**
 * 4、创建实现接口的颜色实体类Red
 * Created by luosv on 2017/12/5 0005.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
