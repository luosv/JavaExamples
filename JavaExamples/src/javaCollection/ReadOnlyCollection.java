package javaCollection;

import java.util.*;

/**
 * 只读集合
 * Created by LuoSw on 2016/10/31 0031.
 */
public class ReadOnlyCollection {

    public static void main(String[] args) throws Exception {

        List stuff = Arrays.asList(new String[]{"a", "b"});
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        Map map = new HashMap();
        map = Collections.unmodifiableMap(map);
        System.out.println("集合现在是只读！");

    }

}
