// polymorphism is the ability of an object to take on many forms
// method overloading is a form of polymorphism
// method overriding is a form of polymorphism

// overriding like toString
// must have is-a relationship
// must have same name of super class
// must have same parameter of super class

public class Poly {

    // method overloading
    int total(int total){
        return total ;
    }
    int total(int total , int delivery){
        return total + delivery ;
    }
    
    int total(int total , int delivery , int tip){
        return total + delivery + tip ;
    }

    void sayThing(){
        System.err.println("from poly father");
    }
    // every class has his own implementation like want to override
    @Override
    public String toString() {
        return "test overriding";
    }

    public static void main(String[] args) {
        Poly poly = new Poly();
        System.out.println(poly.total(10));
        System.out.println(poly.total(10 , 5));
        System.out.println(poly.total(10 , 5 , 2));

        System.out.println(poly.toString());        
    }
}