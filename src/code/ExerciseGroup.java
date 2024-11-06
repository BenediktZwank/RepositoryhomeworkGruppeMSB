package code;

import java.util.ArrayList;

public class ExerciseGroup {

    private String groupId;
    private int maxCap;
    private String time;
    private ArrayList<Student> members;

    public ExerciseGroup(String groupId, int maxCap, String time, ArrayList<Student> members ) {
        this.groupId = groupId;
        this.maxCap = maxCap;
        this.time = time;
        this.members = members;
    }

}
