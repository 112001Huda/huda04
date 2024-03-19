package CreatingConstructor;

class SuperAndThis {
    SuperAndThis () {
        System.out.println("This is default Constructor");
    }
    class Test extends SuperAndThis {
        Test () {
            System.out.println("This is 2nd Constructor");
        }
    }
}
/*
class Vehicle {
    Vehicle() { System.out.println("Vehicle is created."); }
}

class Bike extends Vehicle {
    Bike() { System.out.println("Bike is created."); }

    Bike(String brand)
    {
        super(); // it calls Vehicle(), the parent class
        // constructor of class Bike
        //this();
        System.out.println("Bike brand is " + brand);
    }
}
class cars {
    public static void main(String args[])
    {
        Bike bike = new Bike("Honda");
    }
}
*/
