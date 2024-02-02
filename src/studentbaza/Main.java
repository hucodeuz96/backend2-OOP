package studentbaza;

import java.util.Scanner;



public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Student.students[0] = new Student("Lazizbek","Olimov",21,1,"Tashkent");
        Student.students[1]= new Student("Laziz","Olimov",21,1,"Tashkent");
        Student.students[2] = new Student("Lazizjon","Olimov",21,1,"Tashkent");
        Student.students[3] = new Student("laziza","Olimova",21,1,"Tashkent");
            String txt = "salom";
            String txt1= new String("salom");
        welcome();
    }
    public static void welcome(){
        System.out.print("1-createStudent\n2-editStudent\n3-deleteStudent\n4-displayAllStudents\n5-searchStudent\n6-exit\nSelect :");
        int select =  sc.nextInt();
        switch (select){
            case 1:{
                Student.createStudent();
                welcome();
                break;
            }
            case 2:{
                Student.editStudent();
                welcome();
                break;
            }
            case 3:{
                Student.deleteStudent();
                welcome();
                break;
            }
            case 4:{
                Student.displayAllStudents();
                welcome();
                break;
            }
            case 5:{
                Student.searchStudent();
                welcome();
                break;
            }

            case 6:{
                System.out.println("************Exit************");
                break;
            }
            default:{
                System.out.println("Error");
                welcome();
            }
        }
    }


}
