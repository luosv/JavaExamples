package java.collection;

import java.util.*;

/**
 * 集合遍历
 * Created by luosv on 2016/10/31 0031.
 */
public class CollectionOfTraverse {

    public static void main(String[] args) {

        listTest();
        setTest();

        Map<String, String> maps = new HashMap<>();
        maps.put("1", "PHP");
        maps.put("2", "Java");
        maps.put("3", "C");
        maps.put("4", "C++");
        maps.put("5", "HTML");
        // 传统的遍历map集合的方法1; keySet()
        //traditionalMethod1(maps);
        // 传统的遍历map集合的方法2; entrySet()
        //traditionalMethod2(maps);
        // 使用增强For循环来遍历map集合方法1; keySet()
        //strongForMethod1(maps);
        // 使用增强For循环来遍历map集合方法2; entrySet()
        strongForMethod2(maps);

    }

    /*
     * List与Set类型集合的遍历
     */
    private static void listTest() {

        List<String> list = new ArrayList<>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.w3cschool.cc");

        // 使用 iterator 遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用传统 for 循环遍历
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            System.out.println(value);
        }

        // 使用增强 for 循环遍历
        for (String value : list) {
            System.out.println(value);
        }

    }

    private static void setTest() {

        Set<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("C");
        set.add("C++");
        // 数据重复添加失败
        set.add("JAVA");
        set.add("JAVASCRIPT");

        // 使用 iterator 遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }

        // 使用增强 for 循环遍历
        for (String value : set) {
            System.out.println(value);
        }

    }

    /*
     * Map类型集合的遍历
     */
    public static void mapTest() {


    }

    private static void strongForMethod1(Map<String, String> maps) {

        Set<String> set = maps.keySet();
        for (String s : set) {
            String key = s;
            String value = maps.get(s);
            System.out.println(key + " : " + value);
        }

    }

    private static void strongForMethod2(Map<String, String> maps) {

        Set<Map.Entry<String, String>> sets = maps.entrySet();
        for (Map.Entry<String, String> entry : sets) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

    private static void traditionalMethod1(Map<String, String> maps) {

        Set<String> sets = maps.keySet();
        // 取得迭代器遍历出对应的值
        Iterator<String> it = sets.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = maps.get(key);
            System.out.println(key + " : " + value);
        }

    }

    private static void traditionalMethod2(Map<String, String> maps) {

        Set<Map.Entry<String, String>> sets = maps.entrySet();
        // 取得迭代器遍历出对应的值
        Iterator<Map.Entry<String, String>> it = sets.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

}
