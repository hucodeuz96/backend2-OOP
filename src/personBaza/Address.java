package personBaza;

import java.util.Scanner;

public class Address {
    private Long id;
    private String country;
    private String region;
    private String destrict;
    private String street;
    private int homeNumber;
    static  Scanner scanner = new Scanner(System.in);
    static Long ID=1L;

    public Address() {
    }

    public Address(Long id, String country, String region, String destrict, String street, int homeNumber) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.destrict = destrict;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    static Address[] addresses = new Address[100];

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getRegion(){
        return this.region;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getStreet(){
        return this.street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public int getHomeNumber(){
        return this.homeNumber;
    }
    public void setHomeNumber(int number){
        this.homeNumber = number;
    }
    public String getDestrict(){
        return this.destrict;
    }
    public void setDestrict(String destrict){
        this.destrict = destrict;
    }
    public String displayAdd(){
        return "Address { id : "+this.id+", country : "+this.country+
                ", region : "+this.region+",destrict : "+destrict+", street : "+street+"homeNumber :"+homeNumber+" }";
    }

    public static void createAddress() {
        System.out.println("**************Add Person**************");
        scanner = new Scanner(System.in);
        Address address = new Address();
        System.out.print("Enter country : ");
        address.setCountry(scanner.nextLine());
        System.out.print("Enter region : ");
        address.setRegion(scanner.nextLine());
        System.out.print("Enter destrict : ");
        address.setDestrict(scanner.nextLine());
        address.setId(ID++);
        System.out.print("Enter street : ");
        address.setStreet(scanner.nextLine());
        System.out.print("Enter homeNumber : ");
        address.setHomeNumber(scanner.nextInt());
        scanner = new Scanner(System.in);
        for (int i = 0; i < addresses.length; i++) {
            if(addresses[i] == null){
                addresses[i] = address;
                break;
            }
        }
        System.out.println("Successfully added");
    }
    public static  void displayAllAddress(){
        for (int i = 0; i < addresses.length; i++) {
            if (addresses[i] != null) {
                System.out.println(addresses[i].displayAdd());//get
            }
        }
    }


}
