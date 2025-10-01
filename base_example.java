class Car {
    string Color;
    int Speed;

    void drive(){
        System.out.println("The car drives at speed: " + speed)
    }
}

class Main{
    public static void main[String[] args] {
        Car myCar = new Car();
        myCar.Color = "Red";
        myCar.Speed = 100;
        myCar.drive();
    }
}

//output: Car is driving at a speed: 100
