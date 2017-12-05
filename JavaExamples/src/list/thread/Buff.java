package list.thread;

/**
 * buff
 * Created by luosv on 2017/5/19 0019.
 */
public class Buff {

    //buff类型
    private int actionType;
    //buff模型id
    private int modelId;
    //buff组
    private int group;
    //等级
    private int level;

    Buff() {
    }

    Buff(int actionType, int modelId, int group, int level) {
        this.actionType = actionType;
        this.modelId = modelId;
        this.group = group;
        this.level = level;
    }

    public int getActionType() {
        return actionType;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
