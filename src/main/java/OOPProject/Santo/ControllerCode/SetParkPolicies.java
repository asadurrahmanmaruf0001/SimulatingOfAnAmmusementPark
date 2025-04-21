package OOPProject.Santo.ControllerCode;

public class SetParkPolicies {
    private String policyName;
    private String policyDetails;

    public SetParkPolicies(String policyName, String policyDetails) {
        this.policyName = policyName;
        this.policyDetails = policyDetails;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    @Override
    public String toString() {
        return "SetParkPolicies{" +
                "policyName='" + policyName + '\'' +
                ", policyDetails='" + policyDetails + '\'' +
                '}';
    }
}
