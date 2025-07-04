public class Main {

    // static block
    static{
        System.out.println("From static block");
    }
    public static void main(String[] args) {

        System.out.println(" \n ----- Car ----- \n");

        Car car1 = new Car();
        car1.setName("BMW");
        System.out.println(car1.getName());

        Car car2 = new Car();
        car2.setName("Mercedes");
        car2.setModel(2023);
        System.out.println(car2.getName());
        System.out.println(car2.getModel());

        System.out.println(" \n ----- Circle ----- \n");
        Circle circle1 = new Circle();
        circle1.setRadius(10);
        circle1.setColor("Red");
        
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle1.toString());

        System.out.println(" \n ----- Account ----- \n");

        Account account1 = new Account("1234", 1000.0 );
        System.out.println(account1.toString());

        Account account2 = new Account(12345, 1200.0);
        System.out.println(account2.toString());

        // use copy constructor
        Account account3 = new Account(account1);
        System.out.println(account3.toString());

        System.out.println(" \n ----- Student ----- \n");

        Student student1 = new Student("John");
        Student student2 = new Student("fady");
        Student student3 = new Student("bob");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        Student.InnerClass innerClass = new Student.InnerClass();
        innerClass.display();
    
    }
}
