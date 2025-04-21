package OOPProject.Maruf;

public class DiscountTicket {
    private String name;
    private int age;
    private String type;
    private double originalPrice;
    private double finalPrice;

    public DiscountTicket(String name, int age, String type, double originalPrice, double finalPrice) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.originalPrice = originalPrice;
        this.finalPrice = finalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "DiscountTicket{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", originalPrice=" + originalPrice +
                ", finalPrice=" + finalPrice +
                '}';
    }
}
