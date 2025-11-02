package homework_13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String name;
    private List<Group> groups = new ArrayList<>();
    private FacultyStatus facultyStatus;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public FacultyStatus getFacultyStatus() {
        return facultyStatus;
    }

    public void setFacultyStatus(FacultyStatus facultyStatus) {
        this.facultyStatus = facultyStatus;
    }

    public void checkStatusOfFaculty() {
        int result = 0;
        for (Group gr : groups) {
            {
                for (Student student : gr.getStudents()) {
                    result++;
                }
            }
        }
        if (result < 20){
            setFacultyStatus(FacultyStatus.NOT_ACTIVE);
        }
    }


}
