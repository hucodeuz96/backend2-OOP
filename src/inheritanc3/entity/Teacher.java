package inheritanc3.entity;

public class Teacher extends BaseClass {
    private String sepeciality;
    private Double salary;

    public Teacher(Long id, String name, String address, String sepeciality, Double salary) {
        super(id, name, address);
        this.sepeciality = sepeciality;
        this.salary = salary;
    }

    public Teacher(Long id, String name, String address) {
        super(id, name, address);
    }
    public Teacher(){

    }

    public Teacher(String sepeciality, Double salary) {
        this.sepeciality = sepeciality;
        this.salary = salary;
    }

    public String getSepeciality() {
        return sepeciality;
    }

    public void setSepeciality(String sepeciality) {
        this.sepeciality = sepeciality;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
