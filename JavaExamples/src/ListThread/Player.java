package ListThread;

import java.util.ArrayList;
import java.util.List;

/**
 * player
 * Created by luosv on 2017/5/19 0019.
 */
public class Player {

    private int id;
    private String name;

    private List<Buff> buffs = new ArrayList<>();

    Player() {
    }

    Player(int id, String name, List<Buff> buffs) {
        this.id = id;
        this.name = name;
        this.buffs = buffs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Buff> getBuffs() {
        return buffs;
    }

    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }
}
