public class B extends A{

    public static void main(String[] args) {
    new B().privateMethod();//no error -output B-privateMethod.Sounds like overriding
    new B().staticMethod();
//no error -output B-StaticMethod.Sounds like overriding
    }

    private void privateMethod() {
        System.out.println("B-privateMethod.");
    }
    // static void staticMethod() {
    //     System.out.println("B-StaticMethod.");
    // }
}


class A{
    private void privateMethod() {
        System.out.println("A-privateMethod.");
    }
    static void staticMethod() {
        System.out.println("A-StaticMethod.");
    }
}