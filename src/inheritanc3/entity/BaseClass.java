package inheritanc3.entity;

public class BaseClass {//SuperClass,ParentClass
    private  Long id;
    private String name;
    private String  address;

    public BaseClass(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public BaseClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseClass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
