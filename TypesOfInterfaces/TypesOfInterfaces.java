public class TypesOfInterfaces {
    public static void main(String[] args) {
        // one way
        B obj = new C();
        obj.show();

        //other way, anonymouse inner class

        B obj1 = new B(){
            @Override
            public void show(){
                System.out.println("in main, overriding the method found in interface B");
            }
        };
        obj1.show();
    }
}

// Normal 2 or more methods

interface A {
    String hello();
    String bye();
    int number();

}

// Functional SAM Single Abstract Method Interface or Functional Interface - only one method
@FunctionalInterface // Use when your intention is to have a SAM
    // lambda expressions only use functional interfaces
interface B{
    void show();
}

// Marker Interface that has no methods is blank, serialization/deserialization
// 2 ways of utilizing the functional interface, classes can implement it and you can create the object within main itself
class C implements B{

    @Override
    public void show() {
        System.out.println("In show");
    }
}