import org.w3c.dom.ls.LSOutput;

public class Demo {
    public static void main(String[] args){
        A obj;
        // obj = new A(); // cannot instantiate interfaces
        obj = new B();
        System.out.println(A.area);
    }

}
interface A{ // Interfaces are not classes, keywords "Public abstract" on methods are not required as they are already implied
    void show();
    void config();
    // Variables in interfaces are final and static, thus need to be defined.
    int age = 31;
    String area = "Dallas";
}

interface X{
    void run();
}

class B implements A, X{ // need to implement both methods else it becomes an abstract class
    // classes can implement multiple interfaces, but must implement all methods that are in the interface
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("In run");
    }
}
// class - class -> extends
// class - interface -> implements
// interface - interface -> extends