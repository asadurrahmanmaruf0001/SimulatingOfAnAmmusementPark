package OOPProject.Akib;

public class technicalIssueModel {
    private String descriptionField;
    private String areaInvolved;
    private String priority;

    public String getDescriptionField() {
        return descriptionField;
    }

    public void setDescriptionField(String descriptionField) {
        this.descriptionField = descriptionField;
    }

    public String getAreaInvolved() {
        return areaInvolved;
    }

    public void setAreaInvolved(String areaInvolved) {
        this.areaInvolved = areaInvolved;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public technicalIssueModel(String descriptionField, String areaInvolved, String priority) {
        this.descriptionField = descriptionField;
        this.areaInvolved = areaInvolved;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "technicalIssueModel{" +
                "descriptionField='" + descriptionField + '\'' +
                ", areaInvolved='" + areaInvolved + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
