public class Demo {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        Status s1 = Status.Failed;
        Status s2 = Status.Success;
        Status s3 = Status.Pending;
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        Status[] s4 = Status.values();
        for(Status si : s4) {
            System.out.println(si);
        }
            if(s == Status.Running){
                System.out.println("All Good");
            }else if(s == Status.Failed){
                System.out.println("Try Again");
            }else if(s == Status.Pending){
                System.out.println("Please wait");
            }else {
                System.out.println("Done");
            }

        switch (s)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        System.out.println(s.getClass().getSuperclass()); // Java.lang.Enum

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ": " + lap.getPrice());

        Laptop[] laptops = Laptop.values();
        for(Laptop l : laptops) {
            System.out.println(l + ": " + l.getPrice());
        }

    }
}
enum Status{ // Can hold constants
    Running, Failed, Pending, Success; // objects of status (enums), objects are named constants
}

enum Laptop{ // Since this is a class, and the variables are objects, we can utilize a constructor to assign values to objects
    Macbook(2000), Dell_XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;
    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}