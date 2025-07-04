// to use static keyword
class Student{
    int id ;
    String name ;
    static int count = 1 ; // to be Common to them
    static  String college = "IT College" ; // static variable to store the name of the college
  
      // static block
    static{
        System.out.println("From static block");
    }
    
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

    public static void main(String[] args) {

        System.out.println(" \n ----- Student ----- \n");

        Student student1 = new Student("John");
        Student student2 = new Student("fady");
        Student student3 = new Student("bob");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        // static class
        Student.InnerClass innerClass = new Student.InnerClass();
        innerClass.display();
    }

}