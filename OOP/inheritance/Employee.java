// inheritance because employee is a type of person and has all the properties of person , also doctor 
// generalization is a type of inheritance  the superclass
// type of inheritance is 
// 1 - single level inheritance
// 2 - multi level inheritance (not supported in java) but by interface
// 3 - hirarchical inheritance
// 4 - hybrid inheritance

// is-a relationship --> employee is a type of person

// if  data is private in person then it not inheritable but can access by setters and getters
// then i use protected it is inheritable

// any class is inheritable by default by object class
class Employee {
    protected String name;
    protected String department;
    protected String email;
    protected String phone;
    protected String address;
    protected int yearOfBirth;

    // first superclass constructor
    public Employee() {
        System.out.println("No arg constructor from Employee");
    }

    public Employee(String name, String department, String email, String address, String phone, int yearOfBirth) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.yearOfBirth = yearOfBirth;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        // any class is inheritable by default by object class
        System.out.println( employee.hashCode());
    }
}