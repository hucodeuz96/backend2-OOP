package contact_system;

import contact_system.entity.Phone;
import contact_system.service.PhoneService;
import contact_system.service.SimcardService;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
   static PhoneService phoneService = new PhoneService();
   static SimcardService simcardService = new SimcardService();
    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
        System.out.print("1-Telefon qoshish\n2-Telefonni ozgartirish\n3-Telefonni o'chirish\n4-Telefonni ko'rish\n5-createSimcard\n6-AddSimCardToTelefon\n7-simcarduchirish\n8-Kontakt qoshish\n9-tokontakt\nBo'limni tanlang : ");
        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                phoneService.create();
                welcome();
                break;
            }
            case 2: {
                phoneService.update();
                welcome();
                break;

            }
            case 3: {
               phoneService.delete();
                welcome();
                break;

            }
            case 5: {
                simcardService.create();
                welcome();
                break;

            }
            case 4: {
                phoneService.getAll();
                welcome();
                break;

            }
            case 6: {
                phoneService.addSimCardToPhone();
                welcome();
                break;
            }
            case 7: {
                simcardService.delete();
                welcome();
                break;

            }




        }
    }
}



