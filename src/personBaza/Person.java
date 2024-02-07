package personBaza;



import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static studentbaza.Main.welcome;


public class Person {
  private    String name;
   private String lastName;
   private int age;
   private int id;
   private Address address;
   private Card[] cards = new Card[5];
   static Scanner scanner = new Scanner(System.in);
   static int iD = 1;
   static Person[]people = new Person[50];

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public static  void addCardToPerson(){
       System.out.print("personId: ");
       int personId = scanner.nextInt();
       System.out.print("cardId: ");
       Long cardId = scanner.nextLong();
       for (Person person : people) {
           if (person!=null && person.getId()==personId) {
               Card[] cards1 = addCard(person, cardId);
               person.setCards(cards1);
           }
       }



   }
   private static Card[] addCard(Person person,Long cardId){
        Card card = new Card();
       for (Card card2 : Card.cards) {
           if (card2!=null && card2.getId()==cardId) {
               card = card2;
           }
       }
       Card[] cards1 = person.getCards();
       for (int i = 0; i < cards1.length; i++) {
           if (cards1[i]==null){
               cards1[i]=card;
               break;
           }
       }
//       for (Card card1 : cards1) {
//           if (card1==null) {
//               card1 = card;
//               break;
//           }
//       }
       return cards1;
   }

   public String getName() {//olish uchun
       return this.name;
   }
   public void setName(String name) {// qiymat berish uchun
       this.name = name;
   }
    public int getId() {//olish uchun
        return this.id;
    }
    public void setId(int id) {// qiymat berish uchun
        this.id = id;
    }
   public String getLastName() {
     return this.lastName;
   }
   public void setLastName(String lastName) {
     this.name = lastName;
   }
   public int getAge() {
     return this.age;
   }
   public void setAge(int age) {
     this.age = age;
   }
   public void setAddress(Address objAddress) {
       this.address = objAddress;
   }
   public Address getAddress() {
       return this.address;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", address=" + address +
                ", cards=" + Arrays.toString(Arrays.stream(cards).filter(Objects::nonNull).toArray()) +
                '}';
    }

    public static void createPerson() {
        System.out.println("**************Add Person**************");
        scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter Name : ");
        person.setName(scanner.nextLine());
        System.out.print("Enter Last Name : ");
        person.setLastName(scanner.nextLine());
        System.out.print("Enter Age : ");
        person.setAge(scanner.nextInt());
        person.setId(iD++);
        scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            if(people[i] == null){
                people[i] = person;
                break;
            }
        }
        System.out.println("Successfully added");
    }
    public static  void displayAllPersons(){
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());//get
            }
        }
    }

    public static void addAddressToPerson(){
        System.out.println("personId: ");
        int personId = scanner.nextInt();
        System.out.println("addressId:");
        Long id = scanner.nextLong();
        Address address1 = new Address();
        for (int i = 0; i < Address.addresses.length; i++) {
            if (Address.addresses[i]!=null && Address.addresses[i].getId() == id){
               address1 = Address.addresses[i];
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i]!=null && people[i].getId() ==personId){
                people[i].setAddress(address1);
            }
        }
    }
    public static void deletePerson(){
        System.out.print("Enter Id : ");
        int id = scanner.nextInt();
        scanner = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            if(people[i] != null){
                if (people[i].id == id){
                    people[i] = null;
                    System.out.println("Successfully deleted");
                    break;
                }

            }
        }
    }

//    public static void editPerson(){
//        System.out.print("studentId :");
//        int id = scanner.nextInt();
//        Person person  = new Person();
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] != null && people[i].id == id) {
//                person = people[i];
//                editInfoPerson(person);
//                break;
//            }
//        }
//
//
//    }
//    public static Person editInfoPerson(Person person){
//        System.out.println("1 - Name\n2 - Last Name\n3 - Age\n5 - Address\n6-back\nSelect : ");
//        int son = scanner.nextInt();
//        switch (son){
//            case 1:
//                System.out.print("Name : ");
//                student.name = scanner.next();
//                editInfoPerson(student);
//            case 2:
//                System.out.print("Last Name : ");
//                student.lastName = scanner.next();
//                editInfoPerson(student);
//            case 3:
//                System.out.print("Age : ");
//                student.age = scanner.nextInt();
//                editInfoPerson(student);
//            case 5:
//                System.out.print("Address : ");
//                scanner = new Scanner(System.in);
//                student.address = scanner.next();
//                editInfoPerson(student);
//            case 6:
//                System.out.println("Back to menu");
//                welcome();
//            default:
//                System.out.println("Error");
//                editInfoPerson(student);
//                break;
//        }
//        return student;
//    }

    public static void searchPerson(){
        System.out.print("student name :");
        String  name = scanner.nextLine();
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                if ( people[i].name.toLowerCase().contains(name.toLowerCase())
                        || people[i].lastName.toLowerCase().contains(name.toLowerCase())){
                    System.out.println(people[i].toString());
                }
            }
        }
    }



}

//Encapsulation in OOP
// field lar private buladi

