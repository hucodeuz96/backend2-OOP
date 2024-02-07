package personBaza;

import studentbaza.Student;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void dataloader(){
        Address.addresses[0] = new Address(1L,"Uzbekiston","Qashqadaryo","Qarshi","Turon",25);
        Address.addresses[1] = new Address(2L,"Uzbekiston","Qashqadaryo","Qarshi","Mustaqillik",26);
    }

    public static void main(String[] args) {
        dataloader();
        welcome();
    }
    public static void welcome(){
        System.out.print("1-createStudent\n2-addAddressToPerson\n3-deleteStudent\n" +
                "4-displayAllStudents\n5-searchStudent\n6-displayAdd\n7-createAddress\n8-createCard" +
                "\n9-addCard\n11-getAllCards\nSelect :");
        int select =  sc.nextInt();
        switch (select){
            case 1:{
                Person.createPerson();
                welcome();
                break;
            }
            case 2:{
                Person.addAddressToPerson();
                welcome();
                break;
            }
            case 3:{
                Person.deletePerson();
                welcome();
                break;
            }
            case 4:{
                Person.displayAllPersons();
                welcome();
                break;
            }
            case 5:{
                Person.searchPerson();
                welcome();
                break;
            }

            case 6:{
                Address.displayAllAddress();
                welcome();
                break;
            }
            case 7:{
                Address.createAddress();
                welcome();
            }
            case 10:{
                System.out.println("sog' buling");
                break;
            }
            case 8:{
                Card.createCard();
                welcome();
            }
            case 9:{
                Person.addCardToPerson();
                welcome();
            }
            case 11:{
                Card.getAllCard();
                welcome();
            }
            default:{
                System.out.println("Error");
                welcome();
            }
        }
    }
}
