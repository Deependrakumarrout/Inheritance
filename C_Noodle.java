package InheritanceInPractice;

public class C_Noodle {
    protected double lengthInCentimeters=68.8;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    C_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    // isTasty method:
    final public boolean isTasty() {
        return true;
    }

    public static void main(String[] args) {
       // Here we are able access the ingredients, lengthInCentimeters because they are protected.
        // This is child class object: badBoy.
        D_Ramen badBoy = new D_Ramen();
        System.out.println(badBoy.ingredients);
        System.out.println(badBoy.isTasty());
        System.out.println(badBoy.lengthInCentimeters);
    }
}
