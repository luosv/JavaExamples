package java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap遍历
 * Created by luosv on 2016/10/26 0026.
 */
public class HashMapTraverse {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "1st");
        hashMap.put("2", "2nd");
        hashMap.put("3", "3rd");

        // 迭代器
        // 这种方法开起来看起来冗余却有优点所在，在老版本java中这是唯一遍历map的方式，好处是在遍历是可调用iterator.remove()
        // 来删除entries，另外两个方法却不能，若在foreach中删除元素结果是不可预测的
        // 使用泛型
        Iterator<Map.Entry<String, String>> entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        // 不使用泛型
        Iterator entryIterator = hashMap.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) entryIterator.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key:" + key + " value:" + value);
        }
        // 使用values
        Iterator iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }

        // foreach better!
        for (Object col : hashMap.values()) {
            System.out.println(col);
        }

        // java8 + lambda
        hashMap.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));
        hashMap.forEach((k, v) -> {
            if ("2".equals(k)) {
                System.out.println("hello 2, key:" + k + " value:" + v);
            }
        });

        // foreach循环中使用entries来遍历，最常见且大多数情况下最可取的方式，键值都需要使用时
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }

        // 在foreach循环中遍历keys或values，只需要map中的键或值通过keySet或values来实现
        // 性能提升10%，代码更干净
        for (String key : hashMap.keySet()) {
            System.out.println("key:" + key);
        }
        for (String value : hashMap.values()) {
            System.out.println("value:" + value);
        }

    }

}
