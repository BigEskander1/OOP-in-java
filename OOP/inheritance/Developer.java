// will learn super keyword
// and after call super constructor it will call subclass constructor
class Developer extends Employee {
    String projectName ;

    // after call super constructor it will call Employee constructor
    public Developer() {
        System.out.println("No arg constructor from Developer");
    }

    public Developer(String name, String department, String email, String address, String phone, int yearOfBirth, String projectName) {
        super(name, department, email, address, phone, yearOfBirth); // call Employee constructor --> super and super is first line
        this.projectName = projectName;

        // super can be used to access parent class data , methods
        // super.address = "No address";
        // super.setAddress("No address");
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Fady");
        developer.setProjectName("Java");
        System.out.println(developer.getName());
        System.out.println(developer.getProjectName());
    }
}