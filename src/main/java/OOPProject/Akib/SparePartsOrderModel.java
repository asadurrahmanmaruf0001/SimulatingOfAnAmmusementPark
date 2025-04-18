package OOPProject.Akib;

public class SparePartsOrderModel {
    private String partName;
    private int quantity;
    private String supplier;

    public SparePartsOrderModel(String partName, int quantity, String supplier) {
        this.partName = partName;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "SparePartsOrderModel{" +
                "partName='" + partName + '\'' +
                ", quantity=" + quantity +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
