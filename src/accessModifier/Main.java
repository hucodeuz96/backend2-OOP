package accessModifier;

import studentbaza.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
//         set qilish
        student.id = 5;
        student.age =25;
        student.address="Tashkent";
        student.name="Javohir";
        student.lastName="Quliyev";
        Student student1= new Student();
        student1.id = 7;
        student1.age =5;
        student1.address="Tashkent";
        student1.name="Javohirbek";
        student1.lastName="Aliyev";
        Student [] mas = new Student[10];
        mas[0] = student;
        mas[1] = student1;
        System.out.println(mas[0].lastName);
        System.out.println(mas[1].lastName);


//        System.out.println("age ="+ student.age+10);
//        System.out.println( "id ="+ student.id+5);
//        System.out.println("address =" +student.address);
//        System.out.println("name =" + student.name);
//        System.out.println("lastName = "+student.lastName);
    }
}
