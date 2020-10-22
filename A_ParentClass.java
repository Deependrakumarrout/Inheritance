package InheritanceInPractice;

// class:
public class A_ParentClass {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    // constructor:
    A_ParentClass(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    // cook method:
     public void cook() {
        this.texture = "cooled";
        System.out.println(texture);
     }

    // main method:
    public static void main(String[] args) {
        // ParentClass obj = new ParentClass();
        // System.out.println(obj.texture);
        B_ChildClass object = new B_ChildClass();

        // This is the object of A_ParentClass which can only work within this class of the method, fields, variable, constructor.
        A_ParentClass obj = new B_ChildClass();
        // System.out.println(obj.dou); --> This statement will not work.
        A_ParentClass real = new A_ParentClass(34,45.45,"none","done");
        System.out.println(object.shape);
        System.out.println(object.ingredients);
        System.out.println(object.dou);
        real.cook();
        obj.cook();
        object.cook();

        System.out.println(obj.texture);
        System.out.println(real.texture);
    }
}
