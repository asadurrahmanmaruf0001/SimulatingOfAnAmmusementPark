package OOPProject.Akib;

import java.time.LocalDate;

public class SurveillanceModel {
    private String cameraName;
    private LocalDate playbackDate;
    private String accessedBy;

    public SurveillanceModel(String cameraName, LocalDate playbackDate, String accessedBy) {
        this.cameraName = cameraName;
        this.playbackDate = playbackDate;
        this.accessedBy = accessedBy;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public LocalDate getPlaybackDate() {
        return playbackDate;
    }

    public void setPlaybackDate(LocalDate playbackDate) {
        this.playbackDate = playbackDate;
    }

    public String getAccessedBy() {
        return accessedBy;
    }

    public void setAccessedBy(String accessedBy) {
        this.accessedBy = accessedBy;
    }

    @Override
    public String toString() {
        return "SurveillanceModel{" +
                "cameraName='" + cameraName + '\'' +
                ", playbackDate=" + playbackDate +
                ", accessedBy='" + accessedBy + '\'' +
                '}';
    }
}
