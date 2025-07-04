class BabyPoly extends Poly{
    int age ;


    public void sayHello() {
        System.out.println("Hello");
    }
    @Override
    void sayThing() {
        System.err.println("from baby poly ");
    }


    public static void main(String[] args) {
        BabyPoly babyPoly = new BabyPoly();
        babyPoly.sayThing();

        // override  called upcasting
        Poly poly = new BabyPoly();
        poly.sayThing();

        // i can not access method in child class 
        // poly.sayHello();
        // poly.age = 10;
    }
}