package javaCollection;

import java.util.*;

/**
 * 集合中添加不同类型元素
 * Created by luosv on 2016/11/3 0003.
 */
public class CollectionAddDifferentTypesOfElements {

    public static void main(String[] args) {

        List<String> lnkLst = new LinkedList<>();
        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");
        lnkLst.add("element4");
        disPalyAll(lnkLst);

        List<String> aryLst = new ArrayList<>();
        aryLst.add("w");
        aryLst.add("x");
        aryLst.add("y");
        aryLst.add("z");
        disPalyAll(aryLst);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        disPalyAll(hashSet);

        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        disPalyAll(treeSet);

        LinkedHashSet<String> lnkHashSet = new LinkedHashSet<>();
        lnkHashSet.add("one");
        lnkHashSet.add("two");
        lnkHashSet.add("three");
        lnkHashSet.add("four");
        disPalyAll(lnkHashSet);

        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "J");
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");
        disPalyAll(map1.keySet());
        disPalyAll(map1.values());

        SortedMap<String, String> map2 = new TreeMap<>();
        map2.put("key1", "JJ");
        map2.put("key2", "KK");
        map2.put("key3", "LL");
        map2.put("key4", "MM");
        disPalyAll(map2.keySet());
        disPalyAll(map2.values());

        LinkedHashMap<String, String> map3 = new LinkedHashMap<>();
        map3.put("key1", "JJJ");
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        disPalyAll(map3.keySet());
        disPalyAll(map3.values());

    }

    private static void disPalyAll(Collection col) {

        // while
//        Iterator itr = col.iterator();
//        while (itr.hasNext()) {
//            String str = (String) itr.next();
//            System.out.print(str + " ");
//        }

        // foreach better!
        for (Object obj : col) {
            String str = (String) obj;
            System.out.print(str + " ");
        }

        System.out.println();

    }

}
