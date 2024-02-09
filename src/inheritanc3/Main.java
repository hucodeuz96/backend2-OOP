package inheritanc3;

import inheritanc3.entity.Abiturent;
import inheritanc3.entity.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(5,"25-m",3l,"Olimjon","qarshi");
        System.out.println(student.getAddress());
        System.out.println(student.getId());
        Abiturent abiturent = new Abiturent();


    }

}
