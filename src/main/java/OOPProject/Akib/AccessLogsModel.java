package OOPProject.Akib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccessLogsModel {
    private String name;
    private LocalDateTime entryTime;
    private String location;

    public AccessLogsModel(String name, LocalDateTime entryTime, String location) {
        this.name = name;
        this.entryTime = entryTime;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AccessLogsModel{" +
                "name='" + name + '\'' +
                ", entryTime=" + entryTime +
                ", location='" + location + '\'' +
                '}';
    }
    public String getEntryTimeFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return entryTime.format(formatter);
    }
}
