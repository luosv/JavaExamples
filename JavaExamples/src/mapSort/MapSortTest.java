package mapSort;

import java.util.*;

/**
 * 排序测试
 * Created by luosv on 2017/5/27 0027.
 */
public class MapSortTest {

    Map<Long, Integer> map = new HashMap<>();

    private void addMapData() {
        map.put(4000000000L, 30000);
        map.put(2000000000L, 10000);
        map.put(5000000000L, 40000);
        map.put(1000000000L, 50000);
        map.put(3000000000L, 20000);
        System.out.println("排序前：" + map);
    }

    private void mapSortTest() {
        List<Map.Entry<Long, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new ScoreSortLongInteger());
        System.out.println("排序后：" + list);
        System.out.println("最大value：" + list.get(0).getValue());
        System.out.println("最大value的key：" + list.get(0).getKey());
    }

    public static void main(String[] args) {
        MapSortTest mapSort = new MapSortTest();
        mapSort.addMapData();
        mapSort.mapSortTest();
    }

}
