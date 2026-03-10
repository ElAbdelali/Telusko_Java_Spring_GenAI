public class LambdaExpressions {
    public static void main(String[] args) {

        A obj = new A(){
            public void show(int i){
                System.out.println("in main show using anonymous class" + i);
            }
        };
        obj.show(2);

        // using lambda to do the above
        // if one method exists, you can eliminate verbose code
        A obj1 = (i) ->{
            System.out.println("in main class using a lambda expression to express the importance of functional interfaces" + i);
        };
        obj1.show(4);

        A obj2 =  i -> System.out.println("Lambda expression done in one line" + i );
        obj2.show(5);

        B obj3 = new B(){
            public int add(int i, int j){
                return i+j;
            }
        };
        int result = obj3.add(2,3);
        System.out.println(result);

        B obj4 = (i, j) -> i+j;

        int result2 = obj4.add(2,3);
        System.out.println(result2);
    }
}

@FunctionalInterface
interface A{
    void show(int i);
}
@FunctionalInterface
interface B{
    int add (int i, int j);
}

