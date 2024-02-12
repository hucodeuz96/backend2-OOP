package contact_system.entity;

import inheritanc3.entity.BaseClass;

public class SimCard extends BaseClass {
    private String type;//eSim,Simple
    private int pinCode;

    public SimCard() {
    }
    public SimCard(Long id, String name, String address, String type, int pinCode) {
        super(id, name, address);
        this.type = type;
        this.pinCode = pinCode;
    }
    public SimCard(Long id, String name, String type, int pinCode) {
        super(id, name);
        this.type = type;
        this.pinCode = pinCode;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "SimCard{" +
                "id='" + super.getId() + '\'' +
                "name='" + super.getName() + '\'' +
                "type='" + type + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
