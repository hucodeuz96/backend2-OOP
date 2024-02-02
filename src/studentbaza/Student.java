package studentbaza;

import java.util.Scanner;

import static studentbaza.Main.welcome;

public class Student {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[100];
    public String name;
    public String lastName;
    public int age;
    public int id;
    public String address;
     static  int ID = 1;
    public Student(){}


    public Student(String name, String lastName, int age, int id, String address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.address = address;
    }

    //Constructor
    public static void createStudent() {
        System.out.println("**************Add Student**************");
        scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter Name : ");
        student.name = scanner.nextLine();//set
        System.out.print("Enter Last Name : ");
        student.lastName = scanner.nextLine();
        System.out.print("Enter Age : ");
        student.age = scanner.nextInt();
        student.id = ID++;
        scanner = new Scanner(System.in);
        System.out.print("Enter Address : ");
        student.address = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
        System.out.println("Successfully added");
    }
    public static  void displayAllStudents(){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());//get
            }
        }
    }
    public static void deleteStudent(){
        System.out.print("Enter Id : ");
        int id = scanner.nextInt();
        scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null){
                if (students[i].id == id){
                    students[i] = null;
                    System.out.println("Successfully deleted");
                    break;
                }

            }
        }
    }

    public static void editStudent(){
        System.out.print("studentId :");
        int id = scanner.nextInt();
        Student student  = new Student();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].id == id) {
                student = students[i];
                editInfoStudent(student);
                break;
            }
        }


    }
    public static Student editInfoStudent(Student student){
        System.out.println("1 - Name\n2 - Last Name\n3 - Age\n5 - Address\n6-back\nSelect : ");
        int son = scanner.nextInt();
        switch (son){
            case 1:
                System.out.print("Name : ");
                student.name = scanner.next();
                editInfoStudent(student);
            case 2:
                System.out.print("Last Name : ");
                student.lastName = scanner.next();
                editInfoStudent(student);
            case 3:
                System.out.print("Age : ");
                student.age = scanner.nextInt();
                editInfoStudent(student);
            case 5:
                System.out.print("Address : ");
                scanner = new Scanner(System.in);
                student.address = scanner.next();
               editInfoStudent(student);
            case 6:
                System.out.println("Back to menu");
                welcome();
            default:
                System.out.println("Error");
                editInfoStudent(student);
                break;
        }
        return student;
    }

    public static void searchStudent(){
        System.out.print("student name :");
        String  name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if ( students[i].name.toLowerCase().contains(name.toLowerCase())
                        || students[i].lastName.toLowerCase().contains(name.toLowerCase())){
                    System.out.println(students[i].toString());
                }
            }
        }
    }
    public String toString(){
        return "Student { Name : "+name+", Last_Name : "+lastName+
                ", age : "+age+",id : "+id+", address : "+address+" }\n";
    }



}
