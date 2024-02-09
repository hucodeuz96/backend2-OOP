package inheritanc3.entity;

public class Student extends BaseClass {

    private int age;
    private String school;

    public Student(int age, String school) {
        this.age = age;
        this.school = school;
    }
    public Student(int age, String school,Long id,String name,String address) {
//        super.setId(id);
//        super.setName(name);
//        super.setAddress(address);
        super(id,name,address);
        this.age = age;
        this.school = school;
    }


    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
