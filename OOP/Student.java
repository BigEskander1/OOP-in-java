// to use static keyword
class Student{
    int id ;
    String name ;
    static int count = 1 ; // to be Common to them
    static  String college = "IT College" ; // static variable to store the name of the college
  
    public Student( String name){
        this.id = count++ ; // to give unique id
        this.name = name ;
    }

    @Override
    public String toString() {
        return "Student [id = " + id + " ,  name = " + name + " ,  college = " + college + "]";
    }

    // static method
    // without using specific object , to change the static variable
    //like math methed we use Math.PI without create object
    static void changeCollege(String newCollege){
        college = newCollege ;
        // we can't use non static variable in static method 
        // we should  create object inside static method
    }

    public static class InnerClass{
        public void display(){
            System.out.println("Inner Class");
        }
    }

}