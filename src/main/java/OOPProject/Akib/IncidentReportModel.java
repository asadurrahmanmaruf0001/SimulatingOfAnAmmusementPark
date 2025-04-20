package OOPProject.Akib;

public class IncidentReportModel {
    private String location;
    private String time;
    private String description;
    private String incidentType;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    @Override
    public String toString() {
        return "IncidentReportModel{" +
                "location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", incidentType='" + incidentType + '\'' +
                '}';
    }

    public IncidentReportModel(String location, String time, String description, String incidentType) {
        this.location = location;
        this.time = time;
        this.description = description;
        this.incidentType = incidentType;
    }
}
