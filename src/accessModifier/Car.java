package accessModifier;

public class Car {
    public String id;
    public String name;
    public String color;
    public int position;
    //default constructor
   public Car(){
   }
 // ALL ARGS Constructor
    public Car(String id, String name, String color, int position){
        this.id = id;
        this.name = name;
        this.color = color;
        this.position = position;
    }
    public Car(String id, String name, String color){
        this.id = id;
        this.name = name;
        this.color = color;
    }
    public Car(String id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Car car21 = new Car();
        Car car = new Car("1","Damas");
        Car car1 = new Car("1","Damas","oq");

        System.out.println(car.color);

//        Car car1 = new Car("2", "BMW", "Black", 1);


    }

}
