package design.pattern.builder;

/**
 * 步骤 1
 * 创建一个表示食物条目和食物包装的接口
 * Created by luosv on 2017/12/7 0007.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
