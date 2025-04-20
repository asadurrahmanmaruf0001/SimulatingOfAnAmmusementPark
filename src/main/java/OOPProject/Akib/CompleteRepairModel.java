package OOPProject.Akib;


import java.time.LocalDate;

public class CompleteRepairModel {
    private String equipmentName;
    private LocalDate repairDate;
    private String description;

    public CompleteRepairModel(String equipmentName, LocalDate repairDate, String description) {
        this.equipmentName = equipmentName;
        this.repairDate = repairDate;
        this.description = description;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public LocalDate getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(LocalDate repairDate) {
        this.repairDate = repairDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "CompleteRepairModel{" +
                "equipmentName='" + equipmentName + '\'' +
                ", repairDate='" + repairDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
