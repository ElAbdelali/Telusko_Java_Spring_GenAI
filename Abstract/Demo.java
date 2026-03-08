public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B(); // In order to create object of a subclass, you need an obj of superclass
        obj1.config();

        D obj2 = new D();
        obj2.shows();
        D obj3 = new E();
        obj3.shows();

        D obj4 = new D(){ //anonymouse inner class can be used for implementing abstract classes without creating another class
            public void shows(){
                System.out.println("In new show");
            }
        };
        obj4.shows();
    }

}

class A{
    int age;
    public void show(){
        System.out.println("Show");
    }

    class B{
        public void config(){
            System.out.println("In config");
        }
    }
    static class C{ // can only be static inside another class, superclass cannot be static

    }
}

class D{
    public void shows(){
        System.out.println("In a show");
    }
}

class E extends D{
    public void shows(){
        System.out.println("In E show");
    }
}