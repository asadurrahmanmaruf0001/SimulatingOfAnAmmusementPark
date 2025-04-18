package OOPProject.Akib;

public class EmergencyRepairModel {
    private String equipmentName;
    private String problemDescription;
    private String urgencyLevel;

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public EmergencyRepairModel(String equipmentName, String problemDescription, String urgencyLevel) {
        this.equipmentName = equipmentName;
        this.problemDescription = problemDescription;
        this.urgencyLevel = urgencyLevel;
    }

    @Override
    public String toString() {
        return "EmergencyRepairModel{" +
                "equipmentName='" + equipmentName + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", urgencyLevel='" + urgencyLevel + '\'' +
                '}';
    }
}
