package OOPProject.Santo.ControllerCode;

public class ManageEmergencySituations {
    private String emergencyType;
    private String responsePlan;

    public ManageEmergencySituations(String emergencyType, String responsePlan) {
        this.emergencyType = emergencyType;
        this.responsePlan = responsePlan;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getResponsePlan() {
        return responsePlan;
    }

    public void setResponsePlan(String responsePlan) {
        this.responsePlan = responsePlan;
    }

    @Override
    public String toString() {
        return "ManageEmergencySituations{" +
                "emergencyType='" + emergencyType + '\'' +
                ", responsePlan='" + responsePlan + '\'' +
                '}';
    }
}
