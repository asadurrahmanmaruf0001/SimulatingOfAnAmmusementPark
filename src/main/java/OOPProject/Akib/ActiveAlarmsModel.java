package OOPProject.Akib;

public class ActiveAlarmsModel {
    private String location;
    private String triggerTime;
    private String type;

    public ActiveAlarmsModel(String location, String triggerTime, String type) {
        this.location = location;
        this.triggerTime = triggerTime;
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ActiveAlarmsModel{" +
                "location='" + location + '\'' +
                ", triggerTime='" + triggerTime + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
