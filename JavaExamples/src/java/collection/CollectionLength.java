package java.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合长度
 * Created by luosv on 2016/10/26 0026.
 */
public class CollectionLength {

    public static void main(String[] args) {

        System.out.println("集合实例！\n");

        int size;
        HashSet<String> hashSet = new HashSet<>();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        Iterator<String> iterator;

        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);

        System.out.print("集合数据： ");

        iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

        System.out.println();

        size = hashSet.size();

        if (hashSet.isEmpty()) {
            System.out.println("集合是空的！");
        } else {
            System.out.println("集合长度： " + size);
        }

        System.out.println();

    }

}
