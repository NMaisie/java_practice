package innerClass_outerClass_annomyousClass;

public class OuterClass {
    private String outerMessage  = "Outer class";
    void outer() {
        System.out.println("Dog");
    }
    class Inner{
        void inner(){
            System.out.println("Inner calling + "+ outerMessage);
        }
    }
    public static void main(String[] args) {
        OuterClass out = new OuterClass();

        /** Syntax:OuterClassReference.new MemberInnerClassConstructor();  **/
        OuterClass.Inner in = out.new Inner();

        out.outer(); // Dog
        in.inner(); //Inner calling + Outer class


    }
}
