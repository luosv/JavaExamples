package java.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 遍历 HashTable 的键值
 * Created by luosv on 2016/11/3 0003.
 */
public class TraverseHashTable {

    public static void main(String[] args) {

        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }

}
