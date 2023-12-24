package Domain;
import java.util.Comparator;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public int compareTo(StudentGroup othStudentGroup) {
        return Integer.compare(this.group.size(), othStudentGroup.group.size());
    }

    public static void sortGroupsByStudentCount(List<StudentGroup> groups) {
        groups.sort(Comparator.comparingInt(group -> group.getGroup().size()));
    }
}
