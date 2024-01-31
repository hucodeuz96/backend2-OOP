package loginRegistr;

import java.util.Scanner;

public class Authentification {
    static Scanner scanner = new Scanner(System.in);
    static String phoneNumber, password;
    public static void main(String[] args) {
        System.out.println(password);
        System.out.println(phoneNumber);
      welcome();
    }
    public static void welcome(){
        System.out.println("Tizimga xush kelibsiz");
        System.out.print("1-login\n2-Registrasiy\n3-Exit\nSelect : ");
        int select = scanner.nextInt();
        switch (select){
            case 1:{
                login();
                break;
            }
            case 2:{
                registration();
                break;
            }
            case 3:{
                exit();
                break;
            }
        }
    }
    public static void exit(){
        System.out.println("Tizimdan chiqish🎉🎯");
    }
    public  static  void login(){
        scanner = new Scanner(System.in);
        System.out.println("****************Login page******************");
        if (phoneNumber == null && password == null) {
            System.out.println("**** Siz ruyxatdan o'tmagansiz ****");
           welcome();
        }
        scanner = new Scanner(System.in);
        System.out.print("telefon nomer : ");
        String number = scanner.nextLine();
        System.out.print("parol  : ");
        String parol = scanner.nextLine();
        if(number.equals(phoneNumber) && parol.equals(password)){
            System.out.println("Muvaffaqiyatli kirdingiz");
            welcome();
        }else {
            System.out.println("tel number yoki parol xato");
            login();
        }
    }
    public static void registration(){
        System.out.println("****************Registration page******************");
        System.out.println("Tizim 18 dan katta va 50 kichiklar uchun ruyxatdan o'tish kerak");
        scanner = new Scanner(System.in);
        System.out.print("ismingiz  : ");
        String fname = scanner.nextLine();
        System.out.print("familyangiz  : ");
        String lname = scanner.nextLine();
        System.out.print("tug'ilgan sanangiz  : ");
        String date = scanner.nextLine();
        String email =  checkEmail();//
        int age = checkAge();// yoshni ham tekshiramiz
        scanner = new Scanner(System.in);
        System.out.print("address  : ");
        String address = scanner.nextLine();

        phoneNumber = checkPhone();

        password = checkPassword(); //8 ta uzun bulishi

        System.out.println("Muvaffaqiyatli ruyxatdan o'tdingiz");
        welcome();

    }
    public static String checkEmail(){
        System.out.print("gmail  : ");
        String email = scanner.nextLine();
        if (!email.endsWith("@gmail.com")) {
            System.out.println("Invalid gmail");
            checkEmail();
        }
        return  email;
    }
    public static int checkAge(){
        System.out.print("age  : ");
        int age = scanner.nextInt();
        if (age < 18 || age > 50) {
            System.out.println("Invalid age");
            checkAge();
        }
        return  age;
    }
    public static String checkPhone(){
        scanner = new Scanner(System.in);
        System.out.print("phoneNumber  : ");
        String phone = scanner.nextLine();
        if (phone.length() != 12) {
            System.out.println("Invalid phoneNumber");
            checkPhone();
        }
        return  phone;
    }
    public static String checkPassword(){
        System.out.print("password  : ");
        String password = scanner.nextLine();
        System.out.print("rePassword  : ");
        String rePassword = scanner.nextLine();
        if (password.length() < 8 || !password.equals(rePassword)) {
            System.out.println("Invalid password");
            checkPassword();
        }
        return  password;
    }
}
