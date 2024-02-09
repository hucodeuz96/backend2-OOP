package contact_system.entity;

import inheritanc3.entity.BaseClass;

public class Phone  extends BaseClass {
    private String color;
    private String model;
    private int memory;
    private int simCardCount;
    private Contact contact[]=new Contact[50];
    private SimCard simCard[] = new SimCard[simCardCount];

    public Phone(Long id, String name, String address, String color, String model, int memory, int simCardCount) {
        super(id, name, address);
        this.color = color;
        this.model = model;
        this.memory = memory;
        this.simCardCount = simCardCount;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + super.getId() + '\'' +
                "name='" + super.getName() + '\'' +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", simCardCount=" + simCardCount +
                '}';
    }
}
