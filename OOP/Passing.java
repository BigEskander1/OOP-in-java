// we learn about passing by value , and passing by reference
class Passing {
    int number;

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap2(Passing a, Passing b) {
        int temp = a.number;
        a.number = b.number;
        b.number = temp;
    }

    // return object
    static Passing add(Passing x , Passing y) {
        Passing p = new Passing();
        p.number = x.number + y.number;
        return p;
    }

    // return object
    Passing add2(Passing x ) {
        Passing p = new Passing();
        p.number = x.number + this.number;
        return p;
    }

    // compare object
    static String compare(Passing x , Passing y) {
        return x == y ? "is equal" : "is not equal";
    }
    // compare object
    static String compare2(Passing x , Passing y) {
        return x.number == y.number ? "is equal" : "is not equal";
    }


    public static void main(String[] args) {

        // passing by value
        int x = 10;
        int y = 20;
        swap(x, y);
        
        System.out.println("\nPassing by value");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // passing by reference
        Passing p1 = new Passing();
        Passing p2 = new Passing();
        p1.number = 100;
        p2.number = 200;
        swap2(p1, p2);

        System.out.println("\nPassing by reference");
        System.out.println("p1.number = " + p1.number);
        System.out.println("p2.number = " + p2.number);

        // return object
        System.out.println("\nReturn object");
        Passing p3 = new Passing();
        Passing p4 = new Passing();
        p3.number = 100;
        p4.number = 200;
        Passing p5 = Passing.add(p3, p4);
        System.out.println("p3.number = " + p3.number);
        System.out.println("p4.number = " + p4.number);
        System.out.println("p5.number = " + p5.number);

        // return object
        System.out.println("\nReturn object 2");
        Passing p6 = new Passing();
        Passing p7 = new Passing();
        p6.number = 200;
        p7.number = 400;
        Passing p8 = p6.add2(p7);
        System.out.println("p6.number = " + p6.number);
        System.out.println("p7.number = " + p7.number);
        System.out.println("p8.number = " + p8.number);

        // wrong compare
        System.out.println("\nwrong Compare object");
        System.out.println("p4 has num 200 and p6 has num 200 and compare return " + compare(p4, p6));

        // effect of reference
        System.out.println("\neffect of reference");
        Passing p9 = new Passing();
        Passing p10 = new Passing();
        p10.number = 100;
        p9.number = 200;
        System.out.println(" before p9.number = " + p9.number + " and p10.number = " + p10.number);
        p9 = p10 ;
        p9.number = 400;
        System.out.println(" after p9.number = " + p9.number + " and p10.number = " + p10.number);
        
        
        // right compare
        System.out.println("\nright Compare object");
        System.out.println("p4 has num 200 and p6 has num 200 and compare return " + compare2(p4, p6));
    }
}