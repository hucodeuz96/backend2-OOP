package contact_system.entity;

public class BaseClass {
    private int id;
    private String name;
    protected static String count;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseClass() {
    }
}
