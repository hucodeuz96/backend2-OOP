package personBaza;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Person []people = new Person[100];
        Person person = new Person();
        System.out.print("name: ");
        person.setName(scanner.nextLine());
        System.out.print("lastName: ");
        person.setLastName(scanner.nextLine());
        System.out.print("age");
        person.setAge(scanner.nextInt());
        scanner = new Scanner(System.in);
        System.out.print("address :");
        person.setAddress(scanner.nextLine());
        people[0] = person;
        System.out.println(people[0].getLastName());
        System.out.println(people[0].getAge());


    }
}
