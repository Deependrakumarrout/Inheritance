package InheritanceInPractice;

public class B_ChildClass extends A_ParentClass {

    // constructor:
    //B_ChildClassA() {
    //    super(30.0,0.64,"flat","rice flour");
    //}
   int dou;

    B_ChildClass() {
        super(30.0,0.64,"flat","rice flour");
        this.ingredients="hello java";
        dou =4;
        //super(34,45,"flat","rice flour");
    }

    @Override
    public void cook() {
        texture = "Its done.";
        System.out.println(texture);
    }
}

