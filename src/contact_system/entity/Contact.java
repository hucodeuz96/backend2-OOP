package contact_system.entity;

import inheritanc3.entity.BaseClass;

public class Contact extends BaseClass {
   private String lastname;
   private String number;
   private String email;
   private SimCard simCard;

    public Contact(Long id, String name, String address, String lastname, String number, String email) {
        super(id, name, address);
        this.lastname = lastname;
        this.number = number;
        this.email = email;
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
