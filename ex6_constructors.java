class Car{
    String brand;
    int year;
    
    Car(){
        brand = "A";
        year = 123;
    }
    
    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    
    void display(){
        System.out.println(brand + year);
    }
}

public class Main{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("B", 345);
        
        c1.display();
        c2.display();
    }
}
