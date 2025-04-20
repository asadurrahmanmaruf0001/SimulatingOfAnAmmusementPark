package OOPProject.Akib;

public class ClearanceModel {
    private String personnelName;
    private String accessArea;
    private String clearanceDuration;
    private String accessCode;

    public ClearanceModel(String personnelName, String accessArea, String clearanceDuration, String accessCode) {
        this.personnelName = personnelName;
        this.accessArea = accessArea;
        this.clearanceDuration = clearanceDuration;
        this.accessCode = accessCode;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public String getAccessArea() {
        return accessArea;
    }

    public void setAccessArea(String accessArea) {
        this.accessArea = accessArea;
    }

    public String getClearanceDuration() {
        return clearanceDuration;
    }

    public void setClearanceDuration(String clearanceDuration) {
        this.clearanceDuration = clearanceDuration;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    @Override
    public String toString() {
        return "ClearanceModel{" +
                "personnelName='" + personnelName + '\'' +
                ", accessArea='" + accessArea + '\'' +
                ", clearanceDuration='" + clearanceDuration + '\'' +
                ", accessCode='" + accessCode + '\'' +
                '}';
    }
}
