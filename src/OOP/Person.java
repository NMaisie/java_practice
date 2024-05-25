package OOP;

public class Person {

    private String privateVariable;
    public String publicVariable;
    protected String protectedVariable;
    String defaultVariable;

    public void testVariable(){
        System.out.println(privateVariable);
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }
    public static void testStatic(){
        System.out.println("This is static function");
    }
    public final int getNumberOfEars(){
        return 2;
    }
}

