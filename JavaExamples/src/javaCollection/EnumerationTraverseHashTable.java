package javaCollection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 使用 Enumeration 遍历 HashTable
 * Created by luosv on 2016/11/3 0003.
 */
public class EnumerationTraverseHashTable {

    public static void main(String[] args) {

        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }

}
