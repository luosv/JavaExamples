package map.sort;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Objects;

/**
 * 排序算法
 * Created by luosv on 2017/5/27 0027.
 */
public class ScoreSortLongInteger implements Comparator<Entry<Long, Integer>> {

    @Override
    public int compare(Entry<Long, Integer> o1, Entry<Long, Integer> o2) {
        if (o1.getValue() < o2.getValue()) {
            return 1;
        }
        if (Objects.equals(o1.getValue(), o2.getValue())) {
            return 0;
        }
        return -1;
    }

}
