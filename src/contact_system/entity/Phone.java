package contact_system.entity;

import inheritanc3.entity.BaseClass;

import java.util.Arrays;
import java.util.Objects;

public class Phone  extends BaseClass {
    private String color;
    private String model;
    private int memory;
    private int simCardCount;
    private Contact contact[]=new Contact[50];
    private SimCard simCard[] = new SimCard[simCardCount];

    public int getSimCardCount() {
        return simCardCount;
    }

    public void setSimCardCount(int simCardCount) {
        this.simCardCount = simCardCount;
    }

    public SimCard[] getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard[] simCard) {
        this.simCard = simCard;
    }

    public Phone(Long id, String name, String address, String color, String model, int memory, int simCardCount) {
        super(id, name, address);
        this.color = color;
        this.model = model;
        this.memory = memory;
        this.simCardCount = simCardCount;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + super.getId() + '\'' +
                "name='" + super.getName() + '\'' +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", simCard=" + Arrays.toString(Arrays.stream(simCard).filter(Objects::nonNull).toArray()) +
                '}';
    }


}
