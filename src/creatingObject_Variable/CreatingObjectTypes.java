package creatingObject_Variable;

public class CreatingObjectTypes {
    String str = " Huda ";

    void Demo() {
        System.out.println("To create objects in different types ");
    }

    // This is simple way to create object using New keyword
    public static void main(String[] args) {
        CreatingObjectTypes obj = new CreatingObjectTypes();
        obj.Demo();


        //  USING NEW INSTANCE () METHOD
        // This is Object Creting Through New Instance method Which allows to Create Object Dynamically at  Runtime  Using Instance

        try {
            Class cls = Class.forName("CreatingObjectTypes");
            CreatingObjectTypes obj2 = (CreatingObjectTypes) cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("This is Object creating using new instance method ");
        }
        try {
            CreatingObjectTypes obj1 = CreatingObjectTypes.class.newInstance();
            System.out.println(obj1.str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // USING  CLONE () METHOD
    // object can cloning () the object by using clone ()  method    CLONING Means an object refers to creating a
    // copy of  original Object .

    class Huda implements Cloneable {               // clone() Method
        Huda H1 = new Huda();

        {
            try {
                Huda H2 = (Huda) H1.clone();
                System.out.println("Try block");
            } catch (CloneNotSupportedException e) {
                System.out.println(" Catch block ");
            }
        }
    }
}

