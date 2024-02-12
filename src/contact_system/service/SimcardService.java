package contact_system.service;

import contact_system.entity.SimCard;

import java.util.Scanner;

public class SimcardService extends BaseInterface {
   static Scanner scanner = new Scanner(System.in);
   static  SimCard simcards[] = new SimCard[50];
   static Long Id =1L;
    @Override
    public void create() {
        SimCard simcard1 = new SimCard();
        System.out.print("Nomi : ");
        scanner = new Scanner(System.in);
        simcard1.setName(scanner.nextLine());
        System.out.print("type : ");
        simcard1.setType(scanner.nextLine());
        simcard1.setId(Id++);
        for (int i = 0; i < simcards.length; i++) {
            if (simcards[i]==null){
                simcards[i]=simcard1;
                break;
            }
        }
        System.out.println("qoshildi");
    }

    @Override
    public void getAll() {
        for (int i = 0; i < simcards.length; i++) {
            if (simcards[i]!=null){
                System.out.println(simcards[i].toString()) ;
            }
        }
    }

    @Override
    public void delete() {
        System.out.print("simcardId : ");
        Long simCardId = scanner.nextLong();
        System.out.print("telefonid : ");
        int id = scanner.nextInt();
        for (int i = 0; i < PhoneService.phones.length; i++) {
            if (PhoneService.phones[i]!=null && PhoneService.phones[i].getId()==id){
                SimCard[] simCards = PhoneService.phones[i].getSimCard();
                PhoneService.phones[i].setSimCard( deleteSimcard(simCards,simCardId));
            }

        }
    }

    public SimCard[] deleteSimcard(SimCard[] simCards,Long simCardId){
        for (int i = 0; i < simcards.length; i++) {
            if (simcards[i]!=null && simCards[i].getId().equals(simCardId)){
                simcards[i]= null;
            }
        }
        return simCards;
    }
}
