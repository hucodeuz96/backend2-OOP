package contact_system.entity;



public class Contact extends BaseClass {
   private String lastname;
   private String number;
   private String email;
   private SimCard simCard;

    public Contact(int id, String name, String lastname, String number, String email, SimCard simCard) {
        super(id, name);
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.simCard = simCard;
    }

    public Contact(String lastname, String number, String email) {
        this.lastname = lastname;
        this.number = number;
        this.email = email;
    }

    public Contact() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
