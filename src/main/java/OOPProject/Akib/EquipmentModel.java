package OOPProject.Akib;

import java.time.LocalDate;

public class EquipmentModel {
    private String equipmentID;
    private String equipmentName;
    private String usageHistory;
    private LocalDate lastMaintenanceDate;

    public EquipmentModel(String equipmentID, String equipmentName, String usageHistory, LocalDate lastMaintenanceDate) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.usageHistory = usageHistory;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getUsageHistory() {
        return usageHistory;
    }

    public void setUsageHistory(String usageHistory) {
        this.usageHistory = usageHistory;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }
    public String getStatus() {
        if (lastMaintenanceDate.isBefore(LocalDate.now().minusYears(1))) {
            return "Overdue";
        } else {
            return "OK";
        }
    }

    @Override
    public String toString() {
        return "EquipmentModel{" +
                "equipmentID='" + equipmentID + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", usageHistory='" + usageHistory + '\'' +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                '}';
    }
}
