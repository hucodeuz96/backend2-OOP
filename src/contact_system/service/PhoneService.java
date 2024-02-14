package contact_system.service;

import contact_system.entity.Phone;
import contact_system.entity.SimCard;


import java.util.Scanner;


public class PhoneService implements BaseInterface {
    static Scanner scanner = new Scanner(System.in);
   static Phone []phones = new Phone[50];
   static Long id = 1L;

    @Override
    public  void create() {
        Phone phone = new Phone();
        phone.setId(id++);
        System.out.print("name: ");
        scanner = new Scanner(System.in);
        phone.setName(scanner.nextLine());
        System.out.print("phone address: ");
        phone.setAddress(scanner.nextLine());
        phone.setSimCardCount(5);
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                phones[i] = phone;
                break;
            }
        }

    }

    @Override
    public  void update() {
        System.out.print("Id kod : ");
        int id = scanner.nextInt();
        Phone telefon = new Phone ();
        for (int i = 0; i < phones.length; i++) {
            if(phones[i]!=null && phones[i].getId()==id){
                telefon = phones[i];
                telefoninfo(telefon);
                break;
            }
        }
    }
    public static Phone telefoninfo(Phone telefon){
        System.out.print("1-nomi :\n2-address : \nTanlang : ");
        int selest1 =scanner.nextInt();
        scanner = new Scanner(System.in);
        switch (selest1) {
            case 1: {
                System.out.print("name : ");
                telefon.setName(scanner.nextLine());
                telefoninfo(telefon);
            }
            case 2: {
                System.out.print("Nomi : ");
                telefon.setName(scanner.nextLine());
                telefoninfo(telefon);
            }
            case 3: {
                System.out.print("address : ");
                telefon.setAddress(scanner.nextLine());
                telefoninfo(telefon);
            }
            default: {
                System.out.println("Error");
            }
        }
        return telefon;
    }

    @Override
    public void getOne() {

    }

    @Override
    public void getAll() {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i]!=null){
                System.out.println(phones[i].toString()) ;
            }
        }
    }

    @Override
    public void delete() {
        System.out.print("Id kod :  ");
        scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (int i = 0; i < phones.length; i++) {
            if (phones[i]!=null){
                if (phones[i].getId()==id){
                    phones[i]=null;
                    System.out.println("❗️Telefon o'chirildi❗️\n");
                }
            }
        }
    }
    public void addSimCardToPhone(){
        System.out.print("simcardId : ");
        Long simCardId = scanner.nextLong();
        System.out.print("telefonid : ");
        int id = scanner.nextInt();
        SimCard simcard2 = new SimCard();
        for (int i = 0; i < SimcardService.simcards.length; i++) {
            if (SimcardService.simcards[i]!=null && SimcardService.simcards[i].getId()==simCardId){
                simcard2= SimcardService.simcards[i];
            }
        }

        for (int i = 0; i < phones.length; i++) {
            if (phones[i]!=null && phones[i].getId()==id){
                SimCard[] simCards = phones[i].getSimCard();
                phones[i].setSimCard(simcardAdd(simCards,simcard2));
            }

        }
    }
    public SimCard[] simcardAdd(SimCard[] simCards,SimCard simCard){
        for (int i = 0; i < simCards.length; i++) {
            if (simCards[i]==null){
                simCards[i]=simCard;
                break;
            }
        }
        return simCards;
    }
}
