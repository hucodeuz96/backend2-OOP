package personBaza;

public class Person {
  private    String name;
   private String lastName;
   private int age;
   private int id;
   private String address;

   public String getName() {//olish uchun
       return this.name;
   }
   public void setName(String name) {// qiymat berish uchun
       this.name = name;
   }
   public String getLastName() {
     return this.lastName;
   }
   public void setLastName(String lastName) {
     this.lastName = lastName;
   }
   public int getAge() {
     return this.age;
   }
   public void setAge(int age) {
     this.age = age;
   }
   public void setAddress(String address) {
       this.address = address;
   }
   public String getAddress() {
       return this.address;
   }
   public String display() {
       return "Person { Name : "+name+", Last_Name : "+lastName+
               ", age : "+age+",id : "+id+", address : "+address+" }";
   }


}

//Encapsulation in OOP
// field lar private buladi

