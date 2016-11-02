package javaCollection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 删除集合中指定元素
 * Created by LuoSw on 2016/10/31 0031.
 */
public class CollectionRemove {

    public static void main(String[] args) {

        System.out.println("集合实例！\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);

        System.out.println("集合数据：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

        System.out.println();
        collection.remove(str2);
        System.out.println("删除之后 [ " + str2 + " ] \n");

        System.out.println("现在的集合数据是：");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

        System.out.println();
        size = collection.size();
        System.out.println("集合大小： " + size + "\n");

    }

}
