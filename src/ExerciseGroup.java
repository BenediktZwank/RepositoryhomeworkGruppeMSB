public class ExerciseGroup {

    private int groupId;
    private int maxCap;
    private String time;

    public ExerciseGroup(int groupId, int maxCap, String time) {
        this.groupId = groupId;
        this.maxCap = maxCap;
        this.time = time;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
