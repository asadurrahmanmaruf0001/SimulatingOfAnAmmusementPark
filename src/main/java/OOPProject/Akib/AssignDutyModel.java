package OOPProject.Akib;

public class AssignDutyModel {
    private String name;
    private String assignedZone;

    public AssignDutyModel(String name, String assignedZone) {
        this.name = name;
        this.assignedZone = assignedZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignedZone() {
        return assignedZone;
    }

    public void setAssignedZone(String assignedZone) {
        this.assignedZone = assignedZone;
    }

    @Override
    public String toString() {
        return "AssignDutyModel{" +
                "name='" + name + '\'' +
                ", assignedZone='" + assignedZone + '\'' +
                '}';
    }
}
