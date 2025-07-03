// oop is methodology(style) of programming which is used to design a program in a way that it can be reused and can be easily modified.
// every thing in system is a object like product or customer or company or employee in store system.
// object is a instance of a class is a real world entity.
// object has attributes(data) and methods(methods).


// Access level modifiers --> to hide the data
// public , private , protected 
// public - accessible from anywhere  --> default for functions
// private - accessible only within the class 
// protected - accessible within the class and its subclasses

public class Car {
    private String name ;
    private int model ;
    void setName(String name){
        this.name = name ; // this keyword refers to the current object
    }

    String getName(){
        return name ;
    }

    void setModel(int model){
        if(model > 2015){
        this.model = model ;
        }else{
            System.out.println("Model should be greater than 2015") ;
        }
    }

    int getModel(){
        return model ;
    }

}