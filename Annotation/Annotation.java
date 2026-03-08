public class Annotation {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
    @Override // Will help in case of bugs ex: misspelling the method you intend on overriding
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("B");
    }
}
// Annotation supply the compiler with extra information at runtime