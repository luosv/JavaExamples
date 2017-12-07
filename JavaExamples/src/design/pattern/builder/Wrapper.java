package design.pattern.builder;

/**
 * 步骤 2
 * 创建实现 Packing 接口的实体类
 * Created by luosv on 2017/12/7 0007.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
